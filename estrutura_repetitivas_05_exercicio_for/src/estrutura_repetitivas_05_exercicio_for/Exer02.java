package estrutura_repetitivas_05_exercicio_for;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd_in = 0;
		int qtd_out = 0;
		
		for(int i = 6; i > 0; i--) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				qtd_in += 1;
			}
			else {
				qtd_out += 1;
			}
			
		}
		System.out.println(qtd_in + " in");
		System.out.println(qtd_out + " out");
		sc.close();

	}

}
