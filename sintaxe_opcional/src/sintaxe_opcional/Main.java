package sintaxe_opcional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// OPERADORA DE TELEFONIA COBRA R$ 50.00 POR PLANO BÁSCIO
		// QUE SÁ DIREITO A 100 MINUTOS DE TELEFONE. CADA MINUTO
		// QUE EXCEDER A FRANQUIA DE 100 MINUTOS CUSTA R$ 2.00. FAZER
		// UM PROGRAMA PARA LER A QUEANTIDADE DE MINUTOS QUE UMA PESSOA CONSUMIU, 
		// DAÍ MOSTRAR O VALRO A SER PAGO.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.00;
		if(minutos > 100) {
//			conta = conta +(minutos - 100) * 2.00;
			conta += (minutos - 100) * 2.00;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();
	}

}
