package ProjetosFinais_M10;

public abstract class AnimaisVertebvrado {
	
	public enum TipoAmbiente{Terra, Agua, Ar, TerraAgua, };
	public enum TipoPele{Liso, Escanmada, pelos, penas};
	public enum TipoRespiracao{Pulmoes, Bronquios, Ambos}
	
	public String nome;
	public TipoAmbiente ambiente;
	public TipoPele pele;
	public TipoRespiracao respiracao;
	public boolean asas;
	public boolean patas;
	public boolean barbatanas;
	public boolean tempCorpural;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoAmbiente getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(TipoAmbiente ambiente) {
		this.ambiente = ambiente;
	}
	public TipoPele getPele() {
		return pele;
	}
	public void setPele(TipoPele pele) {
		this.pele = pele;
	}
	public TipoRespiracao getRespiracao() {
		return respiracao;
	}
	public void setRespiracao(TipoRespiracao respiracao) {
		this.respiracao = respiracao;
	}
	public boolean isAsas() {
		return asas;
	}
	public void setAsas(boolean asas) {
		this.asas = asas;
	}
	public boolean isPatas() {
		return patas;
	}
	public void setPatas(boolean patas) {
		this.patas = patas;
	}
	public boolean isBarbatanas() {
		return barbatanas;
	}
	public void setBarbatanas(boolean barbatanas) {
		this.barbatanas = barbatanas;
	}
	public boolean isTempCorpural() {
		return tempCorpural;
	}
	public void setTempCorpural(boolean tempCorpural) {
		this.tempCorpural = tempCorpural;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNome: " + nome);
		builder.append("\nTipo de Ambiente: " + ambiente);
		builder.append("\nTipo de Pele: " + pele);
		builder.append("\nTipo de Respiração: " + respiracao);
		return builder.toString();
	}
	

}
