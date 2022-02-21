package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int peso, e, m;
		
		
		System.out.println("\t\tDigite o peso dos tomates:");
		peso = leia.nextInt();
		
		if(peso > 50) {
			e = peso - 50;
			m = e * 4;
			System.out.println("\nExcedeu o limite do peso " + e + "kg a mais" + ", multa de: " + m + " reais");
		}else {
			e = 0;
			m = 0;
			System.out.println("\nExcedeu o limite do peso " + e + "kg a mais" + ", multa de: " + m + " reais");
			System.out.println("\nEsta dentro das limitações.");
		}
	}
}