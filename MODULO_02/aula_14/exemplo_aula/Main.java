package exemplo_aula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.ladoA = input.nextDouble();
		x.ladoB = input.nextDouble();
		x.ladoC = input.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		y.ladoA = input.nextDouble();
		y.ladoB = input.nextDouble();
		y.ladoC = input.nextDouble();
		
		double areaX = x.calculaArea();
		double areaY = y.calculaArea();
		
		System.out.println("Área triângulo X: " + areaX);
		System.out.println("Área triângulo Y: " + areaY);
		System.out.println("O triângulo maior é: " + ((areaX > areaY) ? areaX : areaY));
		
		input.close();
	}
}
