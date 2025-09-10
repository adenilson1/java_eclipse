package apliacation;

import java.util.Locale;
import java.util.Scanner;


import entities.VetorGeneroAltura;

public class Exer11 {

	public static void main(String[] args) {
//		Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
//		que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
//		de homens. 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		VetorGeneroAltura[] vect = new VetorGeneroAltura[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			vect[i] = new VetorGeneroAltura(genero, altura);

		}

		double maiorAltura = vect[0].getAltura();
		double menorAltura = 0.0;
		for (int i = 1; i < vect.length; i++) {
			if(vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
				menorAltura = vect[0].getAltura();
			}
			
			if(vect[i].getAltura() < menorAltura){
				menorAltura = vect[i].getAltura();
			}

		}
		
		double sum = 0.0;
		int countF = 0;
		int countM = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getGenero() == 'F') {
				sum += vect[i].getAltura();
				countF ++;
			}else {
				countM ++;
			}
		}
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", sum/countF);
		System.out.printf("Numeros de homens = %d", countM);

		sc.close();
	}

}
