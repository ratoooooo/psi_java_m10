package ProjetosFinais_M10;


public class Mamifero extends AnimaisVertebvrado {
	private int numPatas;

	public Mamifero(String nome, int numPatas)
	{
		this.nome = nome;
		this.numPatas = numPatas;
		ambiente = TipoAmbiente.TerraAgua;
		pele = TipoPele.pelos;
		respiracao = TipoRespiracao.Pulmoes;
		asas = false;
		patas = true;
		barbatanas = false;
		tempCorpural = true;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumero de patas: " + numPatas + "\nTemperatura Corpural: " + tempCorpural;
		
	}
	
}
