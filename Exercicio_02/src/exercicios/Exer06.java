package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// Programa que ler um numero e determina em que intervalo ele se encontra
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um valor");
		valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervao [0,25]");
		}
		else if (valor > 25 && valor <= 50) {
			System.out.println("Intervao (20,50]");
		}
		else if (valor > 50 && valor <= 75) {
			System.out.println("Intervao (50,75]");
		}
		else if (valor > 75 && valor <= 100) {
			System.out.println("Intervao (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();

	}

}
