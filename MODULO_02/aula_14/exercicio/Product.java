package exercicio;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock( ) {
		return price * quantity;
	}
	
	public void addProducts(int qtd) {
		quantity += qtd;
	}
	
	public void removeProducts(int qtd) {
		quantity -= qtd;
	}
	
	public void showProductData( ) {
		System.out.printf("Product data: %s , $ %.2f , %d units | TOTAL: $ %.2f \n\n"  ,  name, price, quantity, (totalValueInStock()));
	}
}
