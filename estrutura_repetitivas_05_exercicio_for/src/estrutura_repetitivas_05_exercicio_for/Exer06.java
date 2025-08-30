package estrutura_repetitivas_05_exercicio_for;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Div = 0;

		
		for(int i = N ; i > 0 ; i--) {
			if(N%i == 0) {
				Div = N/i;
				System.out.println(Div);
			}		

		}
		sc.close();

	}

}
