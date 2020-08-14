package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Employee employee = new Employee();
		
		// USER INPUT 
		System.out.println("Name: ");
		employee.name = input.nextLine();
		
		System.out.println("Gross salary: ");
		employee.grossSalary = input.nextDouble();
		                   
		System.out.println("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.println(employee);
		
		// SALARY INCREASE
		System.out.println("Which percentage to increase salary?");
		double percentage = input.nextDouble();
		
		employee.increaseSalary(percentage);
		System.out.println(employee);

		input.close();	
	}

}
