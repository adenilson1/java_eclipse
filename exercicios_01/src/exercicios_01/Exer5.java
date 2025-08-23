package exercicios_01;

import java.util.Locale;
import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		// Programa que ler codigo de uma peça 1, o numero da peças 1, o valor de cada peça 1,
		// o codigo de uma peça 2, o numero de peças 2 e valor unitario de cada peça 2. E mostra
		// o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero1, codigo1, numero2, codigo2;
		double valor_unitario1, valor_unitario2, total;
		
		System.out.println("Entrada:");
		codigo1 = sc.nextInt(); numero1 = sc.nextInt(); valor_unitario1 = sc.nextDouble();
		codigo2 = sc.nextInt(); numero2 = sc.nextInt(); valor_unitario2 = sc.nextDouble();
		
		total = numero1 * valor_unitario1 + numero2 * valor_unitario2;
		
		System.out.println("Saída:");
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	
	
		
		sc.close();

	}

}
