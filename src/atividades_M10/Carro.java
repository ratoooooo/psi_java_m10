package atividades_M10;

public abstract class Carro {
	public int ano;
	public String modelo;

	public double consumo(double km, double litros) {
		return (litros / km) * 100;
	}

	public abstract void dadosCarro();
}
