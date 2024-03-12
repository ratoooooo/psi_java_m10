package atividades_M10;

public class Aluno extends Pessoa {

	private String escola;
	
	public Aluno(String nome, String escola)
	{
		super.nome = nome;
		this.escola = escola;
	}
	

	public String estado() {
		return "está morto!";
	}
	
}
