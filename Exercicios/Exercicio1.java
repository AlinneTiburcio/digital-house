package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e 
		 * verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.*/
		
		double p,e,m;
		
		try (Scanner ler = new Scanner  (System.in)){
		
		System.out.println("\nQual o peso do tomate: ");
		p = ler.nextDouble();
		}
		
		if(p >= 50) {
			System.out.println("\nN�o h� excesso: " +p);
			e = 0;
			System.out.println("\nO peso � excedente: " +e);
			m = 0;
			System.out.println("\nmulta de: " +m);
			
		}
		
		else {
			System.out.printf("\nO peso esta acima do permitido: %2.2f" +p);
			p = Math.ceil(p);
			e = p - 50;
			System.out.println("\nO peso � exccedente: " +e);
			m = 4* e;
			System.out.println("\nMulta a ser paga: " +m);
			e = 0;
		}

	}

}
