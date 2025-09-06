package entities;

public class Product01 {
	public String name;
	public double price;
	public int quantity;
	
	public Product01(String name, double price, int quality) { // construtor
		this.name = name;
		this.price = price;
		this.quantity = quality;
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
