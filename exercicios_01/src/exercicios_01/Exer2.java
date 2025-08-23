package exercicios_01;

import java.util.Locale;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo
		// e depois mostrar o valor da área deste círculo com 
		// quatro casas decimais
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.println("Valor do raio:");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A área do círculo de raio %.2f é igual %.4f%n", raio, area);
		sc.close();

	}

}
