package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.SomaVetor;

public class Exer02 {

	public static void main(String[] args) {
//		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//		- Imprimir todos os elementos do vetor
//		- Mostrar na tela a soma e a média dos elementos do vetor 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		SomaVetor[] vect = new SomaVetor[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numer: ");
			double number = sc.nextDouble();
			vect[i] = new SomaVetor(number);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getNumber();
		}

		System.out.print("\nVALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i].getNumber() + " ");
		}

		System.out.printf("\nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", sum / n);

		sc.close();

	}

}
