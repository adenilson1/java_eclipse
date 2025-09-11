package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.Product01;

public class Program03 {

	public static void main(String[] args) {
		// Programa para leitura de um numero inteiro N
		// e os dados (nome e preço) de N produtos. Armazene o sN produtos em um vetor.
		// Em seguida,
		// mostra o preço medio dos produtos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product01[] vect = new Product01[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product01(name, price);

		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();

	}

}
