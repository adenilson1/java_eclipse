package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		// Programa faz leitura de codigo de o munu de uma lanchonete
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double preco_total;
		
		System.out.println("Digite  codigo e a quantidade");
		codigo = sc.nextInt(); quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco_total = (double) quantidade * 4.00;
			System.out.printf("Total R$ %.2f%n", preco_total);
		}
		else if (codigo == 2) {
			preco_total = (double) quantidade * 4.50;
			System.out.printf("Total R$ %.2f%n", preco_total);
		}
		else if (codigo == 3) {
			preco_total = (double) quantidade * 5.00;
			System.out.printf("Total R$ %.2f%n", preco_total);
		}
		else if (codigo == 4) {
			preco_total = (double) quantidade * 2.00;
			System.out.printf("Total R$ %.2f%n", preco_total);
		}
		else if (codigo == 5) {
			preco_total = (double) quantidade * 1.50;
			System.out.printf("Total R$ %.2f%n", preco_total);
		}
		else {
			System.out.println("Pedido incorreto");
		}
		sc.close();

	}

}
