package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Exer03 {

	public static void main(String[] args) {
//		Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
//		Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
//		de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Pessoa(name, idade, altura);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getAltura();
		}
		System.out.println();

		System.out.printf("Altura média: %.2f%n", sum / n);
		
		int pessoaComMenosDezesseisAnos = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				pessoaComMenosDezesseisAnos +=1;
			}
		}

		System.out.println("Pessoas com menos de 16 anos: " 
		+ (pessoaComMenosDezesseisAnos * 100 / n)  + "%");
		
		for(int i = 0; i < vect.length; i ++) {
			if (vect[i].getIdade() < 16) {
				System.out.print(vect[i].getName() + "\n");;
			}
		}
		sc.close();

	}

}
