package atividades_M10;

public class Circulo extends Figura {

    private double raio;

    public Circulo() {
        raio = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo: ");
		builder.append("Raio: " + raio);
		builder.append("\narea:" + area());
		builder.append("\nperimetro: " + perimetro());
		return builder.toString();
	}
}
