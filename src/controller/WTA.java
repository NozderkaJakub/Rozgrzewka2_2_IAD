package controller;

import java.io.IOException;
import java.util.Vector;

import model.Centra;

public class WTA extends Program {

	public WTA(int radius, int centerX, int centerY, int noOfCenters, int noOfPoints) throws IOException {
		super(radius, centerX, centerY, noOfCenters, noOfPoints);
	}

	@Override
	public void changeCenterCoords(double[] point, Centra centro) {
		Vector<Double> V = new Vector<Double>();
		Vector<Double> vector = new Vector<Double>();
		vector.add((point[0] - centro.x));
		vector.add((point[1] - centro.y));
		V.add((centro.x + alpha * vector.get(0)));
		V.add((centro.y + alpha * vector.get(1)));
		centro.setXY(V);
	}
}
