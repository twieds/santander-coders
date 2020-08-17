package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = input.nextInt();
		
		System.out.println("Enter account holder: ");
		input.nextLine();
		String accountHolder  = input.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = input.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = input.nextDouble();
			
			account = new Account(accountNumber, accountHolder, initialDeposit);
		}
		else {
			account = new Account(accountNumber, accountHolder);
		}
		

		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double value = input.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		value = input.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		input.close();
	}

}
