package exercicios_01;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		// Programa para ler quatro valores inteiros A, B, C, D
		// A seguir, calcular e mostrar a diferença do produto
		// de A e B pelo produto de C e D.
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Entre com dados:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		System.out.println("(" + A + " * " + B + " - " + C + " * " + D + ") = " + diferenca);
		sc.close();
		

	}

}
