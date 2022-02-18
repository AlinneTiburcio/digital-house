package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * João precisa que você faça um sistema que leia a variável P (peso de tomates) e 
		 * verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/
		
		double p,e,m;
		
		try (Scanner ler = new Scanner  (System.in)){
		
		System.out.println("\nQual o peso do tomate: ");
		p = ler.nextDouble();
		}
		
		if(p >= 50) {
			System.out.println("\nNão há excesso: " +p);
			e = 0;
			System.out.println("\nO peso é excedente: " +e);
			m = 0;
			System.out.println("\nmulta de: " +m);
			
		}
		
		else {
			System.out.printf("\nO peso esta acima do permitido: %2.2f" +p);
			p = Math.ceil(p);
			e = p - 50;
			System.out.println("\nO peso é exccedente: " +e);
			m = 4* e;
			System.out.println("\nMulta a ser paga: " +m);
			e = 0;
		}

	}

}
