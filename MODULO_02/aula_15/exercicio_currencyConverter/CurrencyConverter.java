package main;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double convertToDollar(double price, double amount) {
		amount += calculateIOF(amount);
		return amount * price;
	}
	
	public static double calculateIOF(double amount) {
		return amount * IOF;
	}

}
