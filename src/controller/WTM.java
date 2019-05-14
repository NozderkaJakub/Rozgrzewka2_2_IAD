package controller;

import java.io.IOException;
import java.util.Comparator;
import java.util.Vector;

import model.Centra;

public class WTM extends Program {
	private double lambda;
	private Vector<Vector<Double>> distance;

	public WTM(int radius, int centerX, int centerY, int noOfCenters, int noOfPoints) throws IOException {
		super(radius, centerX, centerY, noOfCenters, noOfPoints);
		lambda = 3.0;
		distance = new Vector<Vector<Double>>();
	}

	private double theta(int t) {
		return Math.exp(-(Math.pow(ro(t), 2)) / (2 * Math.pow(lambda(), 2)));
	}

	private double ro(int t) {
		return (distance.get(0).get(1) - distance.get(t).get(1));
	}

	private double lambda() {
		if (lambda <= 0.1003)
			return 0.1;
		lambda -= 0.0003;
		return lambda;
	}

	@Override
	public void changeCenterCoords(double[] point, Centra c) {
		checkDistanceToNeighbors(c);
		for (int i = 0; i < centra.size(); i++) {
			Vector<Double> V = new Vector<Double>();
			Vector<Double> vector = new Vector<Double>();
			vector.add(point[0] - centra.get((int) distance.get(i).get(1).intValue()).x);
			vector.add(point[1] - centra.get((int) distance.get(i).get(1).intValue()).y);
			V.add((centra.get((int) distance.get(i).get(1).intValue()).x + alpha * theta(i) * vector.get(0)));
			V.add((centra.get((int) distance.get(i).get(1).intValue()).y + alpha * theta(i) * vector.get(1)));
			c.setXY(V);
		}
	}

	private void checkDistanceToNeighbors(Centra c) {
		distance.clear();
		for (int i = 0; i < centra.size(); i++) {
			Vector<Double> V = new Vector<Double>();
			V.add(0, c.checkDistance(centra.get(i)));
			V.add(1, (double) i);
			distance.add(V);
		}
		System.out.println(distance.toString());
		distance.sort(new Comparator<Vector<Double>>() {
			@Override
			public int compare(Vector<Double> o1, Vector<Double> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}

		});
		System.out.println(distance.toString());
		System.out.println();
		System.out.println();
	}

}
