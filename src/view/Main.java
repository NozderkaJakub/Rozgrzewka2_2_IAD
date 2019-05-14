package view;

import java.io.IOException;

import controller.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Program program;
		if (args[0].equals(new String("WTA"))) {
			program = new WTA(2, 3, 0, 2, 100);
			System.out.println("racja xd");
		} else {
			program = new WTM(2, 3, 0, 10, 100);
		}
		
		System.out.println(program.centra.get(0).x + " " + program.centra.get(0).y);
		System.out.println(program.centra.get(1).x + " " + program.centra.get(1).y);
		program.algorithm();
		System.out.println(program.centra.get(0).x + " " + program.centra.get(0).y);
		System.out.println(program.centra.get(1).x + " " + program.centra.get(1).y);

//		double error = 0, oldError = 0;
//		int iteration = 1;
//
//		do {
//			System.out.println("Nowy zbiór danych " + iteration);
//			oldError = error;
//			error = 0;
//			for (int i = 0; i < program.centra.size(); i++) {
//				System.out.println(program.centra.get(i).x + ";" + program.centra.get(i).y);
//			}
//			System.out.println("b³¹d");
//			System.out.println(iteration); // do pliku OutK.png - wykres zmian b³êdu kwantyzacji
//			System.out.println(error + "\n\n\n");
//			iteration++;
//		} while (error != oldError);

		System.out.println("Koniec :)");

	}

}
