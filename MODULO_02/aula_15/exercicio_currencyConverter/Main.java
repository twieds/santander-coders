package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = input.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double amount = input.nextDouble();
		
		System.out.println("Amount to be paid in reais: " + CurrencyConverter.convertToDollar(price, amount));

		input.close();	
	}

}
