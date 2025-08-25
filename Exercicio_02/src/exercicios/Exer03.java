package exercicios;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// Programa que ler se dois numeros interios são multiplos
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite dois numeros inteiros:");
		num1 = sc.nextInt(); num2 = sc.nextInt();
		
		if (num1%num2 == 0 || num2%num1 == 0) {
			System.out.printf("%d e %d são multiplos",num1, num2);
		}
		else {
			System.out.printf("%d e %d não são multiplos", num1, num2);
		}
		
		sc.close();

	}

}
