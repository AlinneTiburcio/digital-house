package PortoSeguro;

import java.util.Scanner;
public class arrayVetor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [] media = new float [5];
		float n1,n2,n3,somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++)
		{
			System.out.println("\nNota do aluno: "+(x+1));
			System.out.println("\nDigite a primeira nota: ");
			n1 = leia.nextInt();
			while(n1<0 || n1>10)
			{
				System.out.println("\nNúmeros válidos de 0 a 10...\nDigite a primeira nota: ");
				n1 = leia.nextInt();
			}
			System.out.println("\nDigite a segunda nota: ");
			n2 = leia.nextInt();
			{
			while(n2<0 || n2>10)
			{
				System.out.println("\nNúmeros válidos de 0 a 10...\nDigite a segunda nota: ");
					n2 = leia.nextInt();
			}
			}
			System.out.println("\nDigite a terceira nota: ");
			n3 = leia.nextInt();
			while(n3<0 || n3>10)
			{
				System.out.println("\nNúmeros válidos de 0 a 10...\nDigite a terceira nota: ");
				n3 = leia.nextInt();
			}
		
			media[x] = (n1+n2+n3) / 3;
		
			if (media[x]>=7 && media[x]<=10)
			{
				System.out.println("\nAluno aprovado!");
			}
			else if (media[x]>=5 && media[x]<7)
			{
				System.out.println("\nAluno de exame!");
			}
			else
			{
				System.out.println("\nAluno de reprovado!");
			}
			
			System.out.println("\nMédia: "+media[x]);
		
			somaMedia += media[x];
		
		}
			mediaGeral = media[x] / 5;
	
	}
}