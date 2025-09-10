package apliacation;

import java.util.Scanner;

import entities.VetorA;
import entities.VetorB;
import entities.VetorC;

public class Exer06 {

	public static void main(String[] args) {
//		Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
//		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
//		o vetor C gerado.
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores quer digitar?");
		int n = sc.nextInt();
		VetorA[] vectA = new VetorA[n];
		VetorB[] vectB = new VetorB[n];
		VetorC[] vectC = new VetorC[n];



		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vectA.length; i++) {
			int numero = sc.nextInt();
			vectA[i] = new VetorA(numero);
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vectB.length; i++) {
			int numero = sc.nextInt();
			vectB[i] = new VetorB(numero);
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < vectC.length; i++) {
			int resultado =  vectA[i].getVetorA() + vectB[i].getVetorB();
			vectC[i] = new VetorC(resultado);
			System.out.println(vectC[i].getVetorC() + " ");
		}

		sc.close();

	}

}
