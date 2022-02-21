package PortoSeguro;

import java.text.NumberFormat;

public class Empregado {
	
	//crição dos atributos
	
	private String nome;
	private double salario;
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//coloca a moeda do país
		nf.setMinimumFractionDigits(2);//indica a quantiade de casas depois da vírgula
		String formatoMoeda = nf.format(salario);//ormata um valor para uma formatação monetária
		return formatoMoeda;
	}
	
	public void imprimir ()
	{
		System.out.println(nome+ "t\t"+" Salário"+this.formatarMoeda());
	}
}
