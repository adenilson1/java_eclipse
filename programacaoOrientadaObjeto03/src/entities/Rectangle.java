package entities;

public class Rectangle {
	public double width;
	public double height;
	
	
	public double Area() {
		return width * height;
	}
	
	public double Perimetro() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return String.format("AREA = %.2f%n",Area())
				+ String.format("PERIMETRO = %.2f%n", Perimetro())
				+ String.format("DIAGONAL = %.2f%n", Diagonal());
	}

}
