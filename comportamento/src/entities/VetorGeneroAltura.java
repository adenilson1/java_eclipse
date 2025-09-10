package entities;

public class VetorGeneroAltura {
	private char genero;
	private double altura;

	public VetorGeneroAltura(char genero, double altura) {
		this.genero = genero;
		this.altura = altura;
	}

	public char getGenero() {
		return genero;
	}

	public double getAltura() {
		return altura;
	}

}
