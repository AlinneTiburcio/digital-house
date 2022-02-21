package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/* EX 5
		 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos
		 * de indústrias que são altamente poluentes do meio ambiente. O índice de poluição 
		 * aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 
		 * 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 
		 * as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o 
		 * índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
		 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada  
		 * aos diferentes grupos de empresas.
		 */
		
		Scanner entrada = new Scanner(System.in);

		//Entrada dos dados
		float iP_medido;
		int qualGrupo, indGrupo1 = 0, indGrupo2 = 0, indGrupo3 = 0;

		System.out.println("Digite em qual grupo a sua empresa se encontra segundo as opções abaixo: "
				+ "\nOpção 1 - Indústrias do 1 grupo "
				+ "\nOpção 2 - Indústrias do 2 grupo"
				+ "\nOpção 3 - Indústrias do 3 grupo");
		qualGrupo = entrada.nextInt();
		
		switch(qualGrupo) {
			case 1:
				indGrupo1++;
				break;
			case 2:
				indGrupo2++;
				break;
			case 3:
				indGrupo3++;
				break;		
			default:
				System.out.println("Opção inválida, por favor digite novamente: ");
				qualGrupo = entrada.nextInt();			
//				while(qualGrupo != indGrupo1 &&  qualGrupo != indGrupo2 && qualGrupo != indGrupo3) {
//					System.out.println("Opção inválida, por favor digite novamente: ");
//					qualGrupo = entrada.nextInt();
//					break;
//				}			
		}
		
		System.out.println("Por favor, digite o qual foi o Índice de Poluição medido: ");
		iP_medido = entrada.nextFloat();

		
		//Processamentos e saída dos dados 
		if (iP_medido > 0.05 && iP_medido <= 0.25) {
			System.out.println("O Índice de Poluição está aceitável."
					+ "\nSua indústria pode continuar suas atividades.");
		}
		else if ((iP_medido > 0.251 && iP_medido <= 0.3) && indGrupo1 == 1) {
			System.out.println("Seu grupo de indústria está intimado a suspender as atividades.");
		} 
		else if ((iP_medido > 0.25 && iP_medido <= 0.3) && (indGrupo2 == 1 || indGrupo3 == 1)) {
			System.out.println("Seu grupo de indústria pode continuar as atividades.");
		} 
		else if ((iP_medido > 0.3 && iP_medido <= 0.4) && (indGrupo1 == 1 || indGrupo2 == 1)){
			System.out.println("Seu grupo de indústria está intimado a suspender as atividades.");
		}
		else if ((iP_medido > 0.3 && iP_medido <= 0.4) && indGrupo3 == 1){
			System.out.println("Seu grupo de indústria pode continuar as atividades.");
		} 
		else if (iP_medido >= 0.5){
			System.out.println("Seu grupo de indústria está intimado a suspender as atividades.");
		} 
		else if (iP_medido >= 0 && iP_medido < 0.05 ) {
			System.out.println("Seu grupo de indústria pode continuar as atividades.");
		} 
		else {
			System.out.println ("Valor inválido, por favor digite novamente: ");
			iP_medido = entrada.nextFloat();
		}
					
	}

}