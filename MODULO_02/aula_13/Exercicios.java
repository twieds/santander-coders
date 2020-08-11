package exercicio;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		//Crie um programa que receba um nome e imprima uma sauda��o
		saudacao();
		System.out.println("***************************");
		
		//Crie um programa que receba um input do teclado com uma idade e retorne se � maior ou menor de idade.
		maiorDeIdade();
		System.out.println("***************************");
		
		//Crie um programa que, dado um dia da semana, verifique se � final de semana.
		finalDeSemana();
		System.out.println("***************************");
		
		//Crie um programa que verifique se a pessoa tem todos os requisitos para dirigir.
		podeDirigir();
	}
	
	//-------------------------------------------------------------------------------------
	//Crie um programa que receba um nome e imprima uma sauda��o
	
	public static void saudacao() {
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.println("Roi! Como voc� se chama?");
		name = input.nextLine();
		System.out.println("Prazer em te conhecer, " + name + "! :)");
	}
	
	//-------------------------------------------------------------------------------------
	//Crie um programa que receba um input do teclado com uma idade e retorne se � maior ou menor de idade.
	
	public static void maiorDeIdade() {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.println("Qual a sua idade?");
		age = input.nextInt();
		
		if (age >= 18) {
			System.out.println("Voc� � maior de idade.");
		} else {
			System.out.println("Voc� ainda n�o � maior de idade.");
		}
	}
	
	//-------------------------------------------------------------------------------------
	//Crie um programa que, dado um dia da semana, verifique se � final de semana.
	
	public static void finalDeSemana() {
		Scanner input = new Scanner(System.in);
		String[] week = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "S�bado"};
		int day;
		
		System.out.println("Selecione um dia: ");
		
		//mostra um menu com os dias da semana, mostrando op��es de 1 a 7
		for (int i = 0; i < week.length; i++) {
			System.out.println((i+1) + " - " + week[i]);
		}
		
		//decrementa 1 do input do usu�rio para buscar a posi��o correta no vetor
		day = input.nextInt() - 1;
		
		if (day < 0 || day > 6) {
			System.out.println("N�mero inv�lido.");
		} else if (day > 0 && day < 6 ) {
			System.out.println(week[day] + " � dia de semana.");
		} else {
			System.out.println(week[day] + " � final de semana.");
		}
	}
	
	//-------------------------------------------------------------------------------------
	//Crie um programa que verifique se a pessoa tem todos os requisitos para dirigir.
	
	public static void podeDirigir() {
		
		Scanner input = new Scanner(System.in);		
		boolean ehMaiorDeIdade, passouNoPsicotecnico, passouNoTeorico, passouNoPratico;

		ehMaiorDeIdade = askForUserInput("Voc� � maior de idade?");
		passouNoPsicotecnico = askForUserInput("Voc� passou no exame psicot�cnico?");
		passouNoTeorico = askForUserInput("Passou no exame te�rico ?");
		passouNoPratico = askForUserInput("E no pr�tico?");
	
		if (ehMaiorDeIdade && passouNoPsicotecnico && passouNoTeorico && passouNoPratico) {
			System.out.println("Eba! Voc� j� pode dirigir!");
		} else {
			System.out.println("Voc� ainda n�o pode dirigir pois n�o cumpre os seguintes requisitos:");
			
			if (!ehMaiorDeIdade) { System.out.println("- Ser maior de idade"); }
			if (!passouNoPsicotecnico) { System.out.println("- Passar no exame psicot�cnico"); }
			if (!passouNoTeorico) { System.out.println("- Passar no exame teorico"); }
			if (!passouNoPratico) { System.out.println("- Passar no exame pr�tico"); }
		}
		
	}
	
	public static boolean askForUserInput(String pergunta) {
		Scanner input = new Scanner(System.in);
		char res; 
		
		do {
			System.out.println(pergunta + " (S/N)");
			res = input.next().charAt(0);
			res = Character.toLowerCase(res);
			
			if (res == 's') {
				return true;
			} else if (res == 'n') {
				return false;
			} else {
				System.out.println("Por favor, responda com 'S' para SIM ou 'N' para NAO.");
			}
			
		} while (res != 's' && res != 'n');
		return false;
	}
	//-------------------------------------------------------------------------------------
}
