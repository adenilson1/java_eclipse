package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.VetorNomeAluno;
import entities.VetorPrimeiraNota;
import entities.VetorSegundaNota;

public class Exer10 {

	public static void main(String[] args) {
//		Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
//		no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
//		os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
//		igual a 6.0 (seis). 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		VetorNomeAluno[] vectNome = new VetorNomeAluno[n];
		VetorPrimeiraNota[] vectPrimeira = new VetorPrimeiraNota[n];
		VetorSegundaNota[] vectSegunda = new VetorSegundaNota[n];

		for (int i = 0; i < vectNome.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, a primeira e segunda nota do %do aluno: %n", i + 1);
			String nome = sc.nextLine();
			vectNome[i] = new VetorNomeAluno(nome);
			double primeiraNota = sc.nextDouble();
			vectPrimeira[i] = new VetorPrimeiraNota(primeiraNota);
			double segundaNota = sc.nextDouble();
			vectSegunda[i] = new VetorSegundaNota(segundaNota);

		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vectNome.length; i++) {
			if ((vectPrimeira[i].getNota() + vectSegunda[i].getNota()) / 2 > 6.0) {
				System.out.print(vectNome[i].getNome() + "\n");

			}

		}

		sc.close();

	}

}
