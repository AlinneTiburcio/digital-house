package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* EX 4
		 * Fa�a um sistema que leia um n�mero inteiro e mostre 
		 * uma mensagem indicando se este n�mero � par ou �mpar, 
		 * e se � positivo ou negativo.
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		int numero;
		
		System.out.println("Por favor, digite um n�mero inteiro: ");
		numero = entrada.nextInt();
	
		
		//Processamentos e sa�da dos dados 
		if (numero % 2 == 0) {
			if (numero < 0) {
				System.out.println("O numero que voc� digitou � par e negativo!");
			} else {
				System.out.println("O numero que voc� digitou � par e positivo!");
			}
		} 
		else if (numero % 2 != 0) {
			if (numero < 0) {
				System.out.println("O numero que voc� digitou � �mpar e negativo!");
			} else {
				System.out.println("O numero que voc� digitou � �mpar e positivo!");
			}
		} 
		else {
			System.out.println("Opc�o inv�lida! \nPor favor, digite novamente um n�mero inteiro: ");
			numero = entrada.nextInt();
		}

	}

}