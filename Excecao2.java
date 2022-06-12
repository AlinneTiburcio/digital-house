package PortoSeguro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	
	//demonstra lançamento de uma exceção quando ocorre uma divisão por zero
	public static int quociente(int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true;//determina se mais entradas são necessárias
		
		do
		{
			try
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d /%d = %d\n",numerador,denominador,resultado);
				continueLoop = false;
			} //fim do try
			catch(InputMismatchException inputMismatchException )
			{
				System.err.printf("\n\nException: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro..." 
				+"Por favor, tente novamente!!");
				
			}
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("\n\nException: %s\\n",arithmeticException);
				System.out.println("\nZero é um denominador inválido!!"
						+"Por favor, tente novamente...");
			}
		}
		while(continueLoop);
	}

}
