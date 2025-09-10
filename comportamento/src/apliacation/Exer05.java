package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorPosicao;

public class Exer05 {

	public static void main(String[] args) {
//		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
//		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
//		considerando a primeira posição como 0 (zero). 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		MaiorPosicao[] vect = new MaiorPosicao[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect[i] = new MaiorPosicao(number);
		}

		System.out.println();
		double maiorNumero = 0.0;
		int posicao = 0;
		System.out.print("MAIOR VALOR = ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() > maiorNumero) {
				maiorNumero = vect[i].getNumber();
				posicao = i;
			}
		}

		System.out.print(maiorNumero);
		System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicao);
		sc.close();

	}

}
