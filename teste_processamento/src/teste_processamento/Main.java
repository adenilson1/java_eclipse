package teste_processamento;

public class Main {

	public static void main(String[] args) {
		int x ,y ;
		double z;
		
		x = 5;
		y = 2 * x;
		z = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("--------------------");
		
		//Calculo de Áreas
		
		System.out.println("Área do Trapezio");
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = ((b + B)/2.0) * h;
		
		System.out.println(area);
		
		System.out.println("--------------------");
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a / c ; // casting
		
		System.out.println(resultado);
		
		System.out.println("--------------------");
		
		double a1;
		int b1;
		a1 = 5.0;
		b1 = (int) a1;
		 System.out.println(b1);
		
		
		

	}

}
