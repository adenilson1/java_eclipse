package entrada_de_dados_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("------------------------");
		//Quebra de linha pendente
		int x;
		String x1, x2, x3;
		
		x = sc.nextInt();
		sc.nextLine();
		x1 = sc.nextLine();
		x2 = sc.nextLine();
		x3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		sc.close();

	}

}
