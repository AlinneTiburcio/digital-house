package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* EX 2
		 * Elabore um sistema que leia as vari�veis C e N, respectivamente 
		 * c�digo e n�mero de horas trabalhadas de um oper�rio. E calcule o 
		 * sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero 
		 * de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
		 * na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente 
		 * de trabalho vale R$ 20,00. No final do processamento imprimir o 
		 * sal�rio total e o sal�rio excedente.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		String nome;
		float horas, hExtra, salHora, salTotal;
				
		System.out.println("Digite o nome do funcion�rio: ");
		nome = entrada.nextLine();
				
		System.out.println("Digite o n�mero de horas trabalhadas deste funcion�rio: ");
		horas = entrada.nextFloat();
			
		
		//Processamentos e sa�da dos dados 
		salHora = 50 * 10;
				
		if (horas > 50) {
			hExtra = (horas - 50) * 20;
			salTotal = salHora + hExtra;
			System.out.printf("\nFuncion�rio: %s \nValor total da hora extra: R$ %5.2f"
				+ "\nSal�rio final deste m�s: R$ % .2f.", nome, hExtra, salTotal);
		} else {
			salTotal = 10 * horas;
			System.out.printf("Funcion�rio: %s \nN�o houve hora extra\nSal�rio total deste m�s: R$ %.2f", nome, salTotal);
		}

	}

}