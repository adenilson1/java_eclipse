package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product03;

public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product03 p = new Product03();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product03 product = new Product03(name, price);
		
		product.setName("PC");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed  stock: ");
		quantity = sc.nextInt();
		product.removerProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();

	}

}
