package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/* EX 6
		 * Elabore um sistema que dada a idade de um nadador 
		 * classifique-o em uma das seguintes categorias:
		 * Infantil A = 5 a 7 anos
		 * Infantil B = 8 a 11 anos
		 * Juvenil A = 12 a 13 anos
		 * Juvenil B = 14 a 17 anos
		 * Adultos = Maiores de 18 anos
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		int idade;
		
		System.out.println("Olá! Temos várias categorias para nossos nadadores: " 
		+ "\n\nOpção 1 - Crianças entre 5 e 8 anos"
		+ "\nOpção 2 - Crianças entre 8 e 12 anos"
		+ "\nOpção 3 - Adolescentes entre 12 e 13 anos"
		+ "\nOpção 4 - Adolescentes entre 13 e 18 anos"
		+ "\nOpção 5 - Acima de 18 anos"
		+ "\nOpção 6 - Menores de 5 anos"
		+ "\n\nPor favor, digite a idade do nadador seguindo as opções:");
		idade = entrada.nextInt();
		
		
		//Processamentos e saída dos dados 
		switch(idade) {	
		case 1:
			System.out.println("Está na categoria Infantil A!");
			break;
		case 2:
			System.out.println("Está na categoria Infantil B!"); 
			break;
		case 3:
			System.out.println("Está na categoria Juvenil A!");
			break;
		case 4:	
			System.out.println("Está na categoria Juvenil B!");
			break;
		case 5:		
			System.out.println("Está na categoria Adulto!");
			break;
		case 6:		
			System.out.println("Ainda não temos categorias para menores de 5 anos, "
					+ "possivelmente abriremos uma nova turma no próximo semestre, fique de olho! ");
			break;
		default://excessão:
			System.out.println("Opção inexistente. \nPor favor, Digite novamente: ");
		}
		
		
		//EX 6 - Usando IF ELSE
		//Entrada dos dados
		int age;
		
		System.out.println("\nPor favor, digite a idade do nadador: ");
		age = entrada.nextInt();
			
		//Processamentos e saída dos dados 
	
		if (age >= 5 && age < 8) {
			System.out.println("Está na categoria Infantil A!");
		} else if (age >= 8 && age < 12) { 
			System.out.println("Está na categoria Infantil B!"); 
		} else if (age >= 12 && age < 14) { 
			System.out.println("Está na categoria Juvenil A!"); 
		} else if (age >= 14 && age < 18) { 
			System.out.println("Está na categoria Juvenil B!"); 
		} else if (age >= 18) { 
			System.out.println("Está na categoria Adulto!"); 
		} else if (age < 5) { 
			System.out.println("Infelizmente não temos categorias para menores de 5 anos de idade.");
	
		} else { 
			System.out.println("Opção inexistente. \\nPor favor, Digite novamente:"); 
		}
		
	}

}