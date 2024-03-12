package atividades_M10;

public class Pessoa {
	public String nome;
	public int peso;
	public double altura;

	public Pessoa()
	{
		nome = "";
		peso =0;
		altura = 0;
	}
	
	public String estado() {
		return "Está vivo!";
	}
}
