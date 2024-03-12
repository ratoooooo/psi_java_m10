package atividades_M10;

public  class Renault extends Carro {

	double consumo;

	public Renault(String modelo, int ano, double consumo) {
		this.modelo = modelo;
		this.ano = ano;
		this.consumo = consumo;
	}
	
	public void dadosCarro()
	{
		System.out.println("Reanault");
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Consumo: " + consumo);
	}
}
