package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product02 p = new Product02();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();


		Product02 product = new Product02(name, price);

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
