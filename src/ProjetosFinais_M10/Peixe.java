package ProjetosFinais_M10;

public class Peixe extends AnimaisVertebvrado  {
	
	private int numBarbatanas;
	
	public Peixe(String nome, int numBarbatanas)
	{
		this.nome = nome;
		this.numBarbatanas = numBarbatanas;
		super.ambiente = TipoAmbiente.Agua;
		super.pele = TipoPele.Escanmada;
		super.respiracao = TipoRespiracao.Bronquios;
		asas = false;
		patas = false;
		barbatanas = true;
		tempCorpural = false;
	}

	public int getNumBarbvatanas() {
		return numBarbatanas;
	}

	public void setNumBarbvatanas(int numBarbatanas) {
		this.numBarbatanas = numBarbatanas;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumero de Barbatanas: "+ numBarbatanas;
	}
}
