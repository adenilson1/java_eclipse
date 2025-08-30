package estrutura_repetitivas_05_exercicio_for;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if( N < 0) {
				System.out.println("Digite um valor inteiro positivo");
			}
			else {
				System.out.println(i +" "+ (int) Math.pow(i, 2)+ " " + (int) Math.pow(i, 3));
			}
			
		}
		sc.close();
	}

}
