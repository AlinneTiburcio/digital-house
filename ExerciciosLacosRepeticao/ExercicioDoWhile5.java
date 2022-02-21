package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.
 * (DO...WHILE)*/

public class ExercicioDoWhile5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int tecla, i = 0, soma = 0;

		System.out.println("Digite um número do teclado: ");
		tecla = leia.nextInt();

		do {
			
			soma += i;
			if (i == 0) {
				System.out.print(0);
			} else {
				System.out.print(" + " + i);
				
			}
			i++;
		} while (i <= tecla);

		System.out.print(" = " + soma);
		leia.close();
	}

}