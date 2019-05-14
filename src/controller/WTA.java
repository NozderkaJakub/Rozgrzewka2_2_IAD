package controller;

import java.io.IOException;
import java.util.Vector;

import model.Centra;

public class WTA extends Program {

	public WTA(int radius, int centerX, int centerY, int noOfCenters, int noOfPoints) throws IOException {
		super(radius, centerX, centerY, noOfCenters, noOfPoints);
	}

	@Override
	protected void changeCenterCoords(double[] point, Centra c) {
		Vector<Double> V = new Vector<Double>();
		Vector<Double> vector = new Vector<Double>();
		vector.add((point[0] - c.x));
		vector.add((point[1] - c.y));
		V.add((c.x + alpha * vector.get(0)));
		V.add((c.y + alpha * vector.get(1)));
		c.setXY(V);
	}
}
