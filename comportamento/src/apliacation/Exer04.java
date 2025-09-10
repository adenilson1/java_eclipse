package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.EvenNumber;

public class Exer04 {

	public static void main(String[] args) {
//		Faça um programa que leia N números inteiros e
//		armazene-os em um vetor. Em seguida, mostre na 
//		tela todos os números pares, e também a quantidade de números pares. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		EvenNumber[]vect = new EvenNumber[n];
		
		for(int i = 0; i < vect.length; i ++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new EvenNumber(number);

		}
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		int cont = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber()%2 == 0) {
				System.out.print(vect[i].getNumber() + " " );
				cont ++;
			}
		}
		System.out.println("\n");
		System.out.printf("QUANTIDADE DE PARES = %d", cont);
		
		sc.close();
	}

}
