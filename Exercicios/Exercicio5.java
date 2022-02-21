package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/* EX 5
		 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos
		 * de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o 
		 * aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 
		 * 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 
		 * as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o 
		 * �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
		 * Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada  
		 * aos diferentes grupos de empresas.
		 */
		
		Scanner entrada = new Scanner(System.in);

		//Entrada dos dados
		float iP_medido;
		int qualGrupo, indGrupo1 = 0, indGrupo2 = 0, indGrupo3 = 0;

		System.out.println("Digite em qual grupo a sua empresa se encontra segundo as op��es abaixo: "
				+ "\nOp��o 1 - Ind�strias do 1 grupo "
				+ "\nOp��o 2 - Ind�strias do 2 grupo"
				+ "\nOp��o 3 - Ind�strias do 3 grupo");
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
				System.out.println("Op��o inv�lida, por favor digite novamente: ");
				qualGrupo = entrada.nextInt();			
//				while(qualGrupo != indGrupo1 &&  qualGrupo != indGrupo2 && qualGrupo != indGrupo3) {
//					System.out.println("Op��o inv�lida, por favor digite novamente: ");
//					qualGrupo = entrada.nextInt();
//					break;
//				}			
		}
		
		System.out.println("Por favor, digite o qual foi o �ndice de Polui��o medido: ");
		iP_medido = entrada.nextFloat();

		
		//Processamentos e sa�da dos dados 
		if (iP_medido > 0.05 && iP_medido <= 0.25) {
			System.out.println("O �ndice de Polui��o est� aceit�vel."
					+ "\nSua ind�stria pode continuar suas atividades.");
		}
		else if ((iP_medido > 0.251 && iP_medido <= 0.3) && indGrupo1 == 1) {
			System.out.println("Seu grupo de ind�stria est� intimado a suspender as atividades.");
		} 
		else if ((iP_medido > 0.25 && iP_medido <= 0.3) && (indGrupo2 == 1 || indGrupo3 == 1)) {
			System.out.println("Seu grupo de ind�stria pode continuar as atividades.");
		} 
		else if ((iP_medido > 0.3 && iP_medido <= 0.4) && (indGrupo1 == 1 || indGrupo2 == 1)){
			System.out.println("Seu grupo de ind�stria est� intimado a suspender as atividades.");
		}
		else if ((iP_medido > 0.3 && iP_medido <= 0.4) && indGrupo3 == 1){
			System.out.println("Seu grupo de ind�stria pode continuar as atividades.");
		} 
		else if (iP_medido >= 0.5){
			System.out.println("Seu grupo de ind�stria est� intimado a suspender as atividades.");
		} 
		else if (iP_medido >= 0 && iP_medido < 0.05 ) {
			System.out.println("Seu grupo de ind�stria pode continuar as atividades.");
		} 
		else {
			System.out.println ("Valor inv�lido, por favor digite novamente: ");
			iP_medido = entrada.nextFloat();
		}
					
	}

}