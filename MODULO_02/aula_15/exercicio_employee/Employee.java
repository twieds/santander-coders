package main;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return (grossSalary - tax);
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += (grossSalary * 10) / 100;
	}
	
	public String toString() {
		return ("Employee: " + name + " -> R$ " + netSalary()); 
	}
}
