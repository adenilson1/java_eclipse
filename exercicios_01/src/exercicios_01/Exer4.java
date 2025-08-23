package exercicios_01;

import java.util.Locale;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// Programa que ler o número do funcionario, sua hora trabalhada, o valor que recebe
		// por cada hora e calcula o sálario.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor_hora, salario;
		int numero, hora;
		
		System.out.println("Entre com o numero, valor/hora e hora:");
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		sc.nextLine();
		valor_hora = sc.nextDouble();
		
		salario = (double) hora * valor_hora;
		System.out.println("Saída:");
		System.out.println("Número = " + numero);
		System.out.printf("Salário = R$ %.2f%n", salario);
		
		

		sc.close();

	}

}
