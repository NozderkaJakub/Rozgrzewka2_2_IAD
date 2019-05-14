package controller;

import java.io.IOException;
import java.util.Vector;

import model.Centra;

public class WTM extends Program {
	private double lambda;

	public WTM(int radius, int centerX, int centerY, int noOfCenters, int noOfPoints) throws IOException {
		super(radius, centerX, centerY, noOfCenters, noOfPoints);
		lambda = 2.0;
	}

	protected double theta(Centra centro, double[] point) {
		return Math.exp(-(Math.pow(centro.checkDistance(point), 2)) / (2 * Math.pow(lambda, 2)));
	}

	@Override
	public void changeCenterCoords(double[] point, Centra centro) {
//		Vector<Double> V = new Vector<Double>();
//		Vector<Double> vector = new Vector<Double>();
//		vector.add((point[0] - centro.x));
//		vector.add((point[1] - centro.y));
//		double theta = theta(centro, point);
//		V.add((centro.x + alpha * theta * vector.get(0)));
//		V.add((centro.y + alpha * theta * vector.get(1)));
//		centro.setXY(V);
	}
}
