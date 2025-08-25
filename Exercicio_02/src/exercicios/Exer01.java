package exercicios;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// Programa para ler se um numero é negativo ou positivo
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número inteiro:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
			
		}
		else {
			System.out.println("POSITIVO");
		}
		
		sc.close();

	}

}
