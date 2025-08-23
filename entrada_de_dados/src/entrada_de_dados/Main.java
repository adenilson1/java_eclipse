package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//leitura de strings
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		System.out.println();
		//leitura de int
		int a;
		a = sc.nextInt();
		
		System.out.println("Você digitou: " + a);
				
		System.out.println();
		// numero com ponto flutuante

		double y;
		y = sc.nextDouble();
		
		System.out.println("Você digitou: " + y);
		
		System.out.println();
		// leitura de caracter
		
		char c ;
		c = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + c);
		
		System.out.println();
		// leitura de vairos dados
		
		String l;
		int i;
		double d;
		
		l = sc.next();
		i = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(l);
		System.out.println(i);
		System.out.println(d);
		
		
		sc.close();

	}

}
