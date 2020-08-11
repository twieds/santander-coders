package exemplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* --------- DECLARAÇÃO DE VARIÁVEIS --------- */
		
		// inteiros
		int age = 25;

		//string
		String name = "Maria";
		
		// condicionais e concatenação
		if (age >= 16 && age < 18) {
			System.out.println("O voto é opcional para " + name);			
		} else if (age > 18) {
			System.out.println("O voto é obrigatório para " + name);
		} else {
			System.out.println(name + " ainda não pode votar.");
		}
		

		
		/* --------- LAÇOS DE REPETIÇÃO --------- */
		for (int i = 0; i <= 10; i++) {
			System.out.println("8 x " + i + " = " + (8*i));
		}
		
		int i = 0;
		while(i <= 10) {
			i++;
			System.out.println("8 x " + i + " = " + (8 * i));
		}
		
		
		int op;
		float num1 = 0, num2 = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Somar ");
			System.out.println("2 - Subtrair ");
			System.out.println("3 - Multiplicar ");
			System.out.println("4 - Dividir ");
			System.out.println("5 - Sair ");
			
			op = sc.nextInt();
			
			if (op > 0 && op < 5) {
				System.out.println("Digite um número: ");
				num1 = sc.nextFloat();
				System.out.println("Digite um número: ");
				num2 = sc.nextFloat();	
			}
			
			switch (op) {
				case 1:
					somar(num1, num2);
					break;
				case 2:
					subtrair(num1, num2);
					break;
				case 3:
					multiplicar(num1, num2);
					break;
				case 4: 
					dividir(num1, num2);
					break;
				case 5:
					System.out.println("Programa encerrado!");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while (op != 5);
	}
	
	/* --------- FUNÇÕES --------- */
	public static void somar(float num1, float num2) {		
		System.out.println("Resultado: " + (num1 + num2));
	}
	
	public static void subtrair(float num1, float num2) {
		System.out.println("Resultado: " + (num1 - num2));
	}
	
	public static void multiplicar(float num1, float num2) {
		System.out.println("Resultado: " + (num1 * num2));
	}
	
	public static void dividir (float num1, float num2) {
		System.out.println("Resultado: " + (num1 / num2));
	}
}
