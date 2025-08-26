package escopo_inicializacao;

public class Main {

	public static void main(String[] args) {
		double price = 400.00;
		double desconto;
		
		if(price < 200.00) {
			desconto = price * 0.1;
		}
		else {
			desconto = 0;
		}
		
		
		System.out.println(desconto);

	}

}
