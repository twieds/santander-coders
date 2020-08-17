package product;

public class Product {


	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalValueInStock( ) {
		return price * quantity;
	}
	
	public void addProducts(int qtd) {
		quantity += qtd;
	}
	
	public void removeProducts(int qtd) {
		quantity -= qtd;
	}
	
	
	@Override
	public String toString() {
		return "Product name: " + name + ", $" + String.format("%.2f", price)  + ", " +  quantity + " units | TOTAL:  $" + String.format("%.2f", totalValueInStock());
	}

}
