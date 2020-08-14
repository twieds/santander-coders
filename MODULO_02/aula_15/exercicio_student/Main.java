package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = input.nextLine();
		
		System.out.println("Grades (3): ");
		student.grade_1 = input.nextDouble();
		student.grade_2 = input.nextDouble();
		student.grade_3 = input.nextDouble();
		
		System.out.println("Final grade: " +  student.finalGrade());
		System.out.println(student);

		input.close();	
	}

}
