package model;

import java.util.Vector;

public class Centra {
	public double x;
	public double y;

	public Centra() {
		this.x = 0;
		this.y = 0;
	}

	public Centra(Vector<Double> V) {
		this.x = V.get(0);
		this.y = V.get(1);
	}

	public void setXY(Vector<Double> V) {
		this.x = V.get(0);
		this.y = V.get(1);
	}

	public double checkDistance(double[] point) {
		return Math.sqrt(Math.pow((this.x - point[0]), 2) + Math.pow((this.y - point[1]), 2));
	}

	public double checkDistance(Centra centro) {
		return Math.sqrt(Math.pow((this.x - centro.x), 2) + Math.pow((this.y - centro.y), 2));
	}
}
