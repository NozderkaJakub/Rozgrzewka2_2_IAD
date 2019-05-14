package controller;

import java.io.IOException;
import java.util.Vector;

public class WTA extends Program {

	public WTA(int radius, int centerX, int centerY, int noOfCenters, int noOfPoints) throws IOException {
		super(radius, centerX, centerY, noOfCenters, noOfPoints);
	}

	@Override
	protected void changeCenterCoords(double[] point, int kx) {
		Vector<Double> V = new Vector<Double>();
		Vector<Double> vector = new Vector<Double>();
		vector.add((point[0] - centra.get(kx).x));
		vector.add((point[1] - centra.get(kx).y));
		V.add((centra.get(kx).x + alpha * vector.get(0)));
		V.add((centra.get(kx).y + alpha * vector.get(1)));
		centra.get(kx).setXY(V);
	}
}
