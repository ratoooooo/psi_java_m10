package atividades_M10;

public class Toyota implements Viatura {

	private String modelo;

	public String modelo(String modmodeloleo) {
		this.modelo = modelo;
		return modelo;
	}

	public double consumo(double km, double litros) {
		double consumo = (litros / km) * 100;
		return consumo;
	}

}
