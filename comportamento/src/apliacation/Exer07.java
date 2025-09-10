package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.VetorAbaixoDaMedia;

public class Exer07 {

	public static void main(String[] args) {

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		VetorAbaixoDaMedia[] vect = new VetorAbaixoDaMedia[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect[i] = new VetorAbaixoDaMedia(number);

		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getVetor();
		}
		
		System.out.println();
		double avg = sum / n;
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vect.length; i++) {
			if (avg > vect[i].getVetor()) {
				System.out.print(vect[i].getVetor() + "\n");
			}
		}
		sc.close();

	}

}
