package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		float n1,n2,resultado=0;
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCaluladora");
		System.out.println("\n 1 -soma");
		System.out.println("\n 2 -Diferença");
		System.out.println("\n 3 -Multiplicação");
		System.out.println("\n 4 -Divisão");
		
		System.out.println("\nEntre com a sua opção");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
		     resultado = n1 + n2;
		     break;
		 
		case 2:
			 resultado = n1 - n2;
			 break;
		case 3:
			 resultado =n1 * n2;
			 break;	 
		
		case 4:
			if(n2==0)
			{
				System.out.println("\nNão é possível fazer divisão por zero!");
			}
			else {	
			 resultado =n1 / n2;
			}
			 break;	
		default:
			System.out.println("\nOpção Invalida!");
		}
		
		System.out.println("\nResultado: "+resultado);
		
	}

}
