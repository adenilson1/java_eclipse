package estrutura_repetitivas_05_exercicio_for;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = x; i >= 1; i--) {
			if(x%2 != 0) {
				System.out.println(x);
			}
			x = x - 1;

		}
		sc.close();

	}

}
