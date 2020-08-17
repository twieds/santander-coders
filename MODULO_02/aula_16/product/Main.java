package product;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList();

		Product product = new Product("TV", 900.00, 10);
		
		productList.add(product);		
		productList.add(new Product("Microondas", 300.00, 100));

		double sum = 0.0;
		for(Product p : productList) {// Específico pra percorrer listas
			sum += p.getPrice();	
			System.out.println(p);
		}
		
		System.out.println("Soma: " + sum);
	}

}
