package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 * */

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			x = leia.nextInt();
			if (x % 2 == 0) {
				par++;

			}
			if (x % 2 == 1) {
				impar++;

			}
		}
		System.out.println("Quantidade  de números par: " + par);
		System.out.println("Quantidade de número ímpar: " + impar);
		leia.close();
	}


}