package exercicios;


import java.util.Locale;
import java.util.Scanner;



public class Exer07 {

	public static void main(String[] args) {
		// Programa que determina o quadrante de duas coordenadas 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		System.out.println("Digite as coordenadas x e y:");
		x = sc.nextDouble(); y = sc.nextDouble();
		
		if (x == 0 && y == 0 ) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0 ) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0 ) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0 ) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0 ) {
			System.out.println("Q4");
		}
		sc.close();

	}

}
