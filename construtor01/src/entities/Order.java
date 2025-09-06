package entities;

import java.util.Date;

public class Order {
	private Date data;
	private Product05 product;
	public Order(Date data, Product05 product) {
		super();
		this.data = data;
		this.product = product;
		this.product.name = "TV";
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Product05 getProduct() {
		return product;
	}
	public void setProduct(Product05 product) {
		this.product = product;
	}
	
	
	

}
