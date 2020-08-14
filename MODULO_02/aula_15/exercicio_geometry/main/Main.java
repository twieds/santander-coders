package main;

import java.util.Scanner;

import geometry.Circle;
import geometry.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();		
		System.out.println(rectangle);
		
		
		System.out.println("Enter circle radius: ");
		double radius = input.nextDouble();
		System.out.println("Perimeter: " + Circle.perimeter(radius));
		System.out.println("Volume: " + Circle.volume(radius));

		input.close();	
	}

}
