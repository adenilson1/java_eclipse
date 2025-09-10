package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.VetorMediaPares;

public class Exer08 {

	public static void main(String[] args) {
//		Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
//		aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
//		digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		VetorMediaPares[] vect = new VetorMediaPares[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new VetorMediaPares(number);
		}

		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumero() % 2 == 0) {
				sum +=  vect[i].getNumero();
				count++;
			}

		}
		
		if(sum == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.printf("MEDIA DOS PARES = %.1f", sum/count);
		}
		



		sc.close();

	}

}
