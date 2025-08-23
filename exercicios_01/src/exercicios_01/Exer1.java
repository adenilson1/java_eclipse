package exercicios_01;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores interios, e depois mostrar na tela 
		// a soma desses números com uma mensagem explicativa.
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, resultado;
		
		System.out.println("Entrada de dados:");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		
		System.out.println("O resultado da soma: " + valor1 + " + " + valor2 + " = " + resultado);
		sc.close();
		

	}

}
