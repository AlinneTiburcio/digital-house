package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* EX 4
		 * Faça um sistema que leia um número inteiro e mostre 
		 * uma mensagem indicando se este número é par ou ímpar, 
		 * e se é positivo ou negativo.
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		int numero;
		
		System.out.println("Por favor, digite um número inteiro: ");
		numero = entrada.nextInt();
	
		
		//Processamentos e saída dos dados 
		if (numero % 2 == 0) {
			if (numero < 0) {
				System.out.println("O numero que você digitou é par e negativo!");
			} else {
				System.out.println("O numero que você digitou é par e positivo!");
			}
		} 
		else if (numero % 2 != 0) {
			if (numero < 0) {
				System.out.println("O numero que você digitou é ímpar e negativo!");
			} else {
				System.out.println("O numero que você digitou é ímpar e positivo!");
			}
		} 
		else {
			System.out.println("Opcão inválida! \nPor favor, digite novamente um número inteiro: ");
			numero = entrada.nextInt();
		}

	}

}