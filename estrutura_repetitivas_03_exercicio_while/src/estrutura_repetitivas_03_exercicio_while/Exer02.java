package estrutura_repetitivas_03_exercicio_while;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int coord_x, coord_y, x = 1;
		
		while (x !=0) {
			System.out.println("Digite a coordenada x e a coordenada y");
			coord_x = sc.nextInt(); coord_y = sc.nextInt();
			
			if(coord_x > 0 && coord_y > 0) {
				System.out.println("Primeiro");
				x = 1;	
			}
			else if(coord_x < 0 && coord_y > 0) {
				System.out.println("Segundo");
				x = 1;	
			}
			else if(coord_x < 0 && coord_y < 0) {
				System.out.println("Treceiro");
				x = 1;	
			}
			else if(coord_x > 0 && coord_y < 0) {
				System.out.println("Quarto");
				x = 1;	
			}
			else {
				x = 0;
			}
			
		}
		System.out.println("Fim");
		sc.close();

	}

}
