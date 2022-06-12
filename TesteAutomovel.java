package PortoSeguro;

public class TesteAutomovel {

	public static void main(String[] args) {
		// instanciando um objetto da classe Automovel
		
		Automovel auto = new Automovel ("Rejane Santos","Celta", "RSA2J34",2015);
		
		auto.imprimirInfo();
		System.out.println("*****************************");
		System.out.println("***TRansferência de Proprietário");
		auto.setNomeProprietario("Emily Pellini");
		System.out.println("*****************************");
		auto.imprimirInfo();

	}

}