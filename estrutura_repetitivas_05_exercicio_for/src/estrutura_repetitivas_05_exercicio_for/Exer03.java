package estrutura_repetitivas_05_exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		double media1 = 0, media2 = 0, media3 = 0;
		
		for(int i = 0; i < 3; i++) {
			
			nota1 = sc.nextDouble(); nota2 = sc.nextDouble(); nota3 = sc.nextDouble();
			
			if( i == 0) {
				media1 = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
			}
			else if( i == 1) {
				media2 = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
			}
			else {
				media3 = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
			}

		}
		System.out.printf("%.1f%n",media1);
		System.out.printf("%.1f%n",media2);
		System.out.printf("%.1f%n",media3);
		sc.close();

	}

}
