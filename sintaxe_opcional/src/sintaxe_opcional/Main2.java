package sintaxe_opcional;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// PROGRAMA QUE LER O DIA DA SEMANA: SWITCH - CASE
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1: {

			dia = "Domingo";
			break;
		}
		case 2: {

			dia = "Segunda";
			break;
		}
		case 3: {

			dia = "Terça";
			break;
		}
		case 4: {

			dia = "Quarta";
			break;
		}
		case 5: {

			dia = "Quinta";
			break;
		}
		case 6: {

			dia = "Sexta";
			break;
		}
		case 7: {

			dia = "Sabádo";
			break;
		}
		default:
			dia = "Valor inválido";
			break;
		}
		System.out.println(dia);
		sc.close();

	}

}
