package ProjetosFinais_M10;

public class Ave extends AnimaisVertebvrado {
	private int numPatas;
	private int numAsas;
	
	public Ave(String nome, int numPatas, int numAsas, boolean voar)
	{
		this.nome = nome;
		this.numPatas = numPatas;
		this.numAsas = numAsas;
		ambiente = TipoAmbiente.Agua;
		pele = TipoPele.Escanmada;
		respiracao = TipoRespiracao.Bronquios;
		asas = true;
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

	public int getNumAsas() {
		return numAsas;
	}

	public void setNumAsas(int numAsas) {
	}
	
	public String toString()
	{
		return super.toString() + "\nNumero de Asas: "+ numAsas + "\nNumero de patas: " + numPatas + "\nTemperatura Corpural: " + tempCorpural;
		
	}
}
