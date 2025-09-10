package apliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.VetorIdade;
import entities.VetorNome;

public class Exer09 {

	public static void main(String[] args) {
//		Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
//		devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
//		da pessoa mais velha. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		VetorNome[]vectNome = new VetorNome[n];
		VetorIdade[]vectIdade = new VetorIdade[n];
		
		for(int i = 0; i < vectNome.length ; i++) {	
			System.out.printf("Dados da %da pessoa %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			vectNome[i] = new VetorNome(nome);
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vectIdade[i] = new VetorIdade(idade);
		}
		
		int maiorIdade = 0;
		int idpessoa = 0;
		for(int i = 0; i < vectIdade.length; i++) {
			if(vectIdade[i].getIdade() > maiorIdade) {
				maiorIdade = vectIdade[i].getIdade();
				idpessoa = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", vectNome[idpessoa].getName());
		sc.close();
	}

}
