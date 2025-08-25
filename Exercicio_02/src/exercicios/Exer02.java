package exercicios;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// Program que ler numeros inteiros são par ou impar
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número interio:");
		numero = sc.nextInt();
		
		if (numero%2 == 0) {
			System.out.printf("O %d é par", numero);
			
		}
		else {
			System.out.printf("O %d é impar", numero);
		}
		sc.close();

	}

}
