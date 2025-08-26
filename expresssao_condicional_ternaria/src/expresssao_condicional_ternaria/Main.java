package expresssao_condicional_ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura condicional ternaria
		// Estrutura opcional ao if-else quando se deseja
		// decidir um valor com base em uma condição
		
		//sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso
		// ? -> if
		// : -> else
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O desconto é de R$ %.2f%n", desconto);

		sc.close();

	}

}
