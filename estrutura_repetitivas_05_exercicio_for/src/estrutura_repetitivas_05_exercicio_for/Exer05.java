package estrutura_repetitivas_05_exercicio_for;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, fatorial = 1;
		N = sc.nextInt();
		
		for(int i = 0; i <= N; i++) {
			
			if(i == 0) {
				fatorial *= 1;
			}
			else if( i==N) {
				fatorial *= N;
			}
			else {
				fatorial *= (N-i);
			}

		}
		System.out.println(fatorial);
		sc.close();

	}

}
