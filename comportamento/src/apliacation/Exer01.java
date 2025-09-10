package apliacation;

import java.util.Scanner;

import entities.NumberNegative;


public class Exer01 {

	public static void main(String[] args) {
//		Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
//		N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
//		todos os números negativos lidos.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qauntos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		NumberNegative []vect = new NumberNegative[n];
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new NumberNegative(number);
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
		}
			
		sc.close();
		
	}

}
