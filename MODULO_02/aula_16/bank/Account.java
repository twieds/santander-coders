package bank;

public class Account {
	
	private String holder;
	private double balance;
	private  int  number;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5;
	}

	public String toString() {
		return "Account " + number
				+ ", Holder: " + holder
				+ ", Balance: $ " + String.format("%.2f", balance) + "\n\n";
	}
	
}
