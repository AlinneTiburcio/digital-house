package PortoSeguro;

public class Celular extends Telefone {
	
	public Celular()
	{
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\n Shalamar...Shalamar");
			break;
		case 2:
			System.out.println("\n Tananinana...Tananinana");
			break;
		default:
			System.out.println("\n Ta...tanana...tanana");
		}
	}
	@Override
	public void disca(String numero)
	{
		System.out.println("\nO número: "+numero+" é um celular...");
	}

}
