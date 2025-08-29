package estrutura_repetitivas_03_exercicio_while;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha_correta = 2002;
		int senha;
		int cont = 0;
		int fim = 1;
		
		while(cont != fim) {
			System.out.println("Digite a senha");
			senha = sc.nextInt();
			
			if(senha != senha_correta) {
				System.out.println("Senha Inválida");
				cont = 0;
			}
			else {
				System.out.println("Acesso Permitido");
				cont = 1;
			}
		}

			
		sc.close();

	}

}
