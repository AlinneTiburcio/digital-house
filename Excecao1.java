package PortoSeguro;

public class Excecao1 {

	public static void main(String[] args) {
		
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)//captura da poss?vel exce??o
		{
			//tratamento da exce??o
			System.out.println("\nA frase inicial est? nula, para solucionar tal problema, foi lhe atribuido um valor default...");
			frase = "Agora tem algo aqui";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nNova frase: "+novaFrase);

	}

}
