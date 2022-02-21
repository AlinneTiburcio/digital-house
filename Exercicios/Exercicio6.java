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
		
		System.out.println("Ol�! Temos v�rias categorias para nossos nadadores: " 
		+ "\n\nOp��o 1 - Crian�as entre 5 e 8 anos"
		+ "\nOp��o 2 - Crian�as entre 8 e 12 anos"
		+ "\nOp��o 3 - Adolescentes entre 12 e 13 anos"
		+ "\nOp��o 4 - Adolescentes entre 13 e 18 anos"
		+ "\nOp��o 5 - Acima de 18 anos"
		+ "\nOp��o 6 - Menores de 5 anos"
		+ "\n\nPor favor, digite a idade do nadador seguindo as op��es:");
		idade = entrada.nextInt();
		
		
		//Processamentos e sa�da dos dados 
		switch(idade) {	
		case 1:
			System.out.println("Est� na categoria Infantil A!");
			break;
		case 2:
			System.out.println("Est� na categoria Infantil B!"); 
			break;
		case 3:
			System.out.println("Est� na categoria Juvenil A!");
			break;
		case 4:	
			System.out.println("Est� na categoria Juvenil B!");
			break;
		case 5:		
			System.out.println("Est� na categoria Adulto!");
			break;
		case 6:		
			System.out.println("Ainda n�o temos categorias para menores de 5 anos, "
					+ "possivelmente abriremos uma nova turma no pr�ximo semestre, fique de olho! ");
			break;
		default://excess�o:
			System.out.println("Op��o inexistente. \nPor favor, Digite novamente: ");
		}
		
		
		//EX 6 - Usando IF ELSE
		//Entrada dos dados
		int age;
		
		System.out.println("\nPor favor, digite a idade do nadador: ");
		age = entrada.nextInt();
			
		//Processamentos e sa�da dos dados 
	
		if (age >= 5 && age < 8) {
			System.out.println("Est� na categoria Infantil A!");
		} else if (age >= 8 && age < 12) { 
			System.out.println("Est� na categoria Infantil B!"); 
		} else if (age >= 12 && age < 14) { 
			System.out.println("Est� na categoria Juvenil A!"); 
		} else if (age >= 14 && age < 18) { 
			System.out.println("Est� na categoria Juvenil B!"); 
		} else if (age >= 18) { 
			System.out.println("Est� na categoria Adulto!"); 
		} else if (age < 5) { 
			System.out.println("Infelizmente n�o temos categorias para menores de 5 anos de idade.");
	
		} else { 
			System.out.println("Op��o inexistente. \\nPor favor, Digite novamente:"); 
		}
		
	}

}