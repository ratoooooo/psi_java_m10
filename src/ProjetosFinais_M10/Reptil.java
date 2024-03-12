package ProjetosFinais_M10;

public class Reptil extends AnimaisVertebvrado{
	private int numPatas;
	
	public Reptil(String nome, int numPatas)
	{
		this.nome = nome;
		this.numPatas = numPatas;
		ambiente = TipoAmbiente.TerraAgua;
		pele = TipoPele.Escanmada;
		respiracao = TipoRespiracao.Pulmoes;
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
		return super.toString() + "\nNumero de Barbatanas: "+ numPatas;
	}
}
