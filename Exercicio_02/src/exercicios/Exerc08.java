package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		// Calculo de imposto de renda
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario_declarado, imposto, s_8,s_18, s_28 ;
		
		System.out.println("Digite o sálario:");
		salario_declarado = sc.nextDouble();
		
		
		if (salario_declarado > 4500.00) {
			s_28 = salario_declarado - 4500;
			s_18 = salario_declarado - s_28 - 3000;
			s_8 = salario_declarado - s_28 - s_18 - 2000;
			imposto = s_8 * 0.08 + s_18 * 0.18 + s_28 * 0.28;
			System.out.printf("R$ %.2f%n",imposto);
		}
		else if (salario_declarado < 4500.00 && salario_declarado > 3000.00) {
			s_18 = salario_declarado - 3000;
			s_8 = salario_declarado - s_18 - 2000;
			imposto = s_8 * 0.08 + s_18 * 0.18;
			System.out.printf("R$ %.2f%n",imposto);
		}
		else {
			System.out.println("Isento");
		}
		sc.close();

	}

}
