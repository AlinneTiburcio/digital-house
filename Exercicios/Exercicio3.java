package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* EX 3
		 * Desenvolva um sistema em que:
		 * Leia 4 (quatro) números;
		 * Calcule o quadrado de cada um;
		 * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		 * Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 * */
		
		Scanner entrada = new Scanner(System.in);
	
		//Entrada dos dados
		double n1, n2, n3, n4;
		double n1quad, n2quad, n3quad, n4quad;
		
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = entrada.nextFloat();
		System.out.println("Digite o quarto número: ");
		n4 = entrada.nextFloat();
		
		
		//Processamentos e saída dos dados 
		n1quad = Math.pow(n1, 2);
		n2quad = Math.pow(n2, 2);
		n3quad = Math.pow(n3, 2);
		n4quad = Math.pow(n4, 2);
		
		if (n3quad >= 1000) {
			System.out.println("\nTerceiro número digitado: " + n3 + "\nRaiz quadrada: " + n3quad);
		}
		
		else {
			System.out.println("\nPrimeiro número digitado: " + n1 + "\nRaiz quadrada: " + n1quad +
					"\n\nSegundo número digitado: " + n2 + "\nRaiz quadrada: " + n2quad +
					"\n\nTerceiro número digitado: " + n3 + "\nRaiz quadrada: " + n3quad +
					"\n\nQuarto número digitado: " + n4 + "\nRaiz quadrada: " + n4quad);
		}
		
	}

}