package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 * */

public class ExercicioWhile3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, menos21 = 0, mais50 = 0;

		while (idade != -99) {
			if (idade >= 0) {
				System.out.println("Digite sua idade ou -99 para sair: ");
				idade = leia.nextInt();
			} else {
				System.out.println("Idade inválida!!!");
				idade = 0;
			}

			if (idade <= 21 && idade >= 0) {
				menos21++;
			} else if (idade >= 50) {
				mais50++;
			}
		}
		System.out.println("\nFim do programa!!!");
		System.out.println("Quantidade de pessoas com menos ou igual a 21 anos: " + menos21);
		System.out.println("Quantidade de pessoas com mais ou igual a 50 anos: " + mais50);
		leia.close();
	}
}