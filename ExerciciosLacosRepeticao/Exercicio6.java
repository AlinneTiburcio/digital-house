package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 6-	Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)*/

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double tecla = 0, soma = 0, i = 0, media = 0;
		String valores = "";

		do {
			System.out.println("Digite um número do teclado ou 0 para sair:");
			tecla = leia.nextInt();
			if (tecla > 0) {
				if (tecla % 3 == 0) {
					i++;
					soma += tecla;
					media = soma / i;
					valores = valores + tecla + " + ";
				} else {
					System.out.println();
				}
			}
		} while (tecla != 0);
		System.out.print("Somatória dos multíplos de 3: \n");
		// devido ao lop do do...while, " + " aparece os tres espaços de caracteres no resultado final, então para remover essa repetição
		// para que não apareça no resultado final é usado a condição abaixo removendo os dois ultimos caracteres, assim
		// evitando que "+ " apareça no resultado final.
		valores = valores.substring(0, valores.length() - 2);
		System.out.print(valores);
		System.out.print("= " + soma);
		System.out.println("\nQuantidade de número múltiplos de 3: \n" + i);
		System.out.println("A média de todos os número inteiros múltiplos de 3: \n" + media);
		leia.close();
	}

}