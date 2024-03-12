package atividades_M10;

public class Quadrado extends Figura {
	private double lado;

	public Quadrado() {
		lado = 0;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return 4 * lado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado: ");
		builder.append("Lado: " + lado);
		builder.append("\nArea:" + area());
		builder.append("\nperimetro: " + perimetro());
		return builder.toString();
	}
	
	
}
