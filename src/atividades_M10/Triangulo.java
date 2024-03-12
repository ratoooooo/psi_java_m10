package atividades_M10;

public class Triangulo extends Figura {

    private double lado1, lado2, lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double per = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(per * (per - lado1) * (per - lado2) * (per - lado3));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Triângulo: ");
        builder.append("\nÁrea: " + area());
        builder.append("\nPerímetro: " + perimetro());
        return builder.toString();
    }
}
