package PortoSeguro;

public class Cavalo extends Animal {
	
	public Cavalo()
	{
		super("Animal: Cavalo");
	}
	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade do cavalo: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom do cavalo: "+somAnimal);
	}

	public void Corre()
	{
		System.out.println("\nUma das características do cachorro é correr...");
	}
}

