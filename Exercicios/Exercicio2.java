package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* EX 2
		 * Elabore um sistema que leia as variáveis C e N, respectivamente 
		 * código e número de horas trabalhadas de um operário. E calcule o 
		 * salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número 
		 * de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
		 * na variável E, caso contrário zerar tal variável. A hora excedente 
		 * de trabalho vale R$ 20,00. No final do processamento imprimir o 
		 * salário total e o salário excedente.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		String nome;
		float horas, hExtra, salHora, salTotal;
				
		System.out.println("Digite o nome do funcionário: ");
		nome = entrada.nextLine();
				
		System.out.println("Digite o número de horas trabalhadas deste funcionário: ");
		horas = entrada.nextFloat();
			
		
		//Processamentos e saída dos dados 
		salHora = 50 * 10;
				
		if (horas > 50) {
			hExtra = (horas - 50) * 20;
			salTotal = salHora + hExtra;
			System.out.printf("\nFuncionário: %s \nValor total da hora extra: R$ %5.2f"
				+ "\nSalário final deste mês: R$ % .2f.", nome, hExtra, salTotal);
		} else {
			salTotal = 10 * horas;
			System.out.printf("Funcionário: %s \nNão houve hora extra\nSalário total deste mês: R$ %.2f", nome, salTotal);
		}

	}

}