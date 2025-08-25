package exercicios;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// Programa que ler hora inicial e final de um jogo, e seu tempo de duração
		
		Scanner sc = new Scanner(System.in);
		int hora_inicial, hora_final, duracao;
		
		System.out.println("Digite a hora inicial e final do jogo");
		hora_inicial = sc.nextInt(); hora_final = sc.nextInt();
		
		if (hora_inicial < hora_final) {
			duracao = hora_final - hora_inicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		else if (hora_inicial == hora_final) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else {
			duracao = 24 + (hora_final - hora_inicial);
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		sc.close();

	}

}
