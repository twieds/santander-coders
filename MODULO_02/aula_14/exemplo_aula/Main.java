package exemplo_aula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do tri�ngulo X: ");
		x.ladoA = input.nextDouble();
		x.ladoB = input.nextDouble();
		x.ladoC = input.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		y.ladoA = input.nextDouble();
		y.ladoB = input.nextDouble();
		y.ladoC = input.nextDouble();
		
		double areaX = x.calculaArea();
		double areaY = y.calculaArea();
		
		System.out.println("�rea tri�ngulo X: " + areaX);
		System.out.println("�rea tri�ngulo Y: " + areaY);
		System.out.println("O tri�ngulo maior �: " + ((areaX > areaY) ? areaX : areaY));
		
		input.close();
	}
}
