package estrutura_repetitivas_03_exercicio_while;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao, fim = 0, voto1 = 0, voto2 = 0, voto3 = 0;
		
		
		while(fim != 4) {
			System.out.println("Escolha: 1-Alcool, 2-Gasolina, 3-Diesel e 4-sair");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1: {
				voto1 += 1;
				break;
				}
			case 2: {
				voto2 += 1;
				break;
				}
			case 3: {
				voto3 += 1;
				break;
				}
			case 4: {
				fim = 4;
				break;
				}
			default:{
				System.out.println("Código inválido (fora da faixa de 1 a 4)");
				break;
				
				}
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + voto1);
		System.out.println("Gasolina: " + voto2);
		System.out.println("Diesel: " + voto3);

	sc.close();

	}
}


