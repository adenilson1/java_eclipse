package entities;

public class Product03 {
	private String name;
	private double price;
	private int quantity;

	public Product03() {

	}

	public Product03(String name, double price, int quality) { // construtor
		this.name = name;
		this.price = price;
		this.quantity = quality;
	}

	public Product03(String name, double price) { // construtor
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removerProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
