package PortoSeguro;

public class Preguica extends Animal {

	public Preguica()
	{
		super("Animal: Preguiça");
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

	public void subirArvores()
	{
		System.out.println("\nUma das características da preguiça é subir em arvores...");
	}
	
	
}

