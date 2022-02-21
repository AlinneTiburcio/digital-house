package Exercicios;

import java.util.Scanner;

/*
 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double b, a, area;
		
		System.out.println("Digite o valor da base do triangulo: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		a = leia.nextDouble();
		
		if(b >= 0 && a >= 0) {
			area = (b*a)/2;
			System.out.printf("A área do triângulo é: %.2f", area);
		}else {
			System.out.println("Valor da base ou altura inválido");
		}
	}

}