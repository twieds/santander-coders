package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");		
		product.name = input.nextLine();		
		
		System.out.print("Price: ");		
		product.price = input.nextDouble();
		
		System.out.print("Quantity in stock: ");		
		product.quantity = input.nextInt();
		product.showProductData();
		
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(input.nextInt());
		product.showProductData();
		
		System.out.print("Enter the number of products to be removed in stock: ");
		product.removeProducts(input.nextInt());
		product.showProductData();
		
		input.close();
	}
}
