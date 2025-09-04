package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator1;

public class ProgramV2 {



	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator1 calc = new Calculator1();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circunference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();

	}

	
}
