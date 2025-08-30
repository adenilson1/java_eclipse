package estrutura_repetitivas_05_exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v1, v2, qtd;
		double resultado;
		
		qtd = sc.nextInt();
		System.out.println(qtd);
		
		for(int i = qtd; i > 0; i--) {
			v1 =  sc.nextInt(); v2 = sc.nextInt();
			if(v2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				resultado = (double) v1/v2;
				System.out.printf("%.1f%n",resultado);
			}
		}

		
		
		
		sc.close();

	}

}
