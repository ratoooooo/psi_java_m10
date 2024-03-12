package ProjetosFinais_M10;

public class Anfíbio extends AnimaisVertebvrado {
	private int numPatas;
	
	public Anfíbio(String nome, int numPatas)
	{
		this.nome = nome;
		this.numPatas = numPatas;
		ambiente = TipoAmbiente.TerraAgua;
		pele = TipoPele.Liso;
		respiracao = TipoRespiracao.Ambos;
		asas = false;
		patas = true;
		barbatanas = false;
		tempCorpural = false;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumero de Patas: "+ numPatas;
	}
	
}
