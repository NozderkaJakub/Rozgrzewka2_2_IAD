package view;

import java.io.IOException;

import controller.*;

public class Main {
	public static void showCenters(Program program) {
		for (int i = 0; i < program.centra.size(); i++) {
			System.out.println(program.centra.get(i).x + "; " + program.centra.get(i).y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Program program;
		if (args[0].equals(new String("WTA"))) {
			program = new WTA(2, 3, 0, 2, 100);
		} else {
			program = new WTM(2, 3, 0, 10, 100);
		}

		showCenters(program);
		program.algorithm();
		System.out.println();
		showCenters(program);

		System.out.println("Koniec :)");

	}

}
