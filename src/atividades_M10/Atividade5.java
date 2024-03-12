package atividades_M10;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		Scanner ler = new Scanner(System.in);
		int op;
		double valor;
		
		do {
			menu();
			op = ler.nextInt();
			switch (op) {
			case 1:
				System.out.println("Inisra o valor do raio");
				valor = ler.nextDouble();
				circulo.setRaio(valor);
				System.out.println(circulo.toString()); 
				break;
			case 2:
				System.out.println("Inisra o valor do lado");
				valor = ler.nextDouble();
				quadrado.setLado(valor);
				System.out.println(quadrado.toString());
				break;
			case 3:
				System.out.println("Inisra o lado 1 do triangulo");
				valor = ler.nextDouble();
				triangulo.setLado1(valor);
				System.out.println("Inisra o lado 2 do triangulo");
				valor = ler.nextDouble();
				triangulo.setLado2(valor);
				System.out.println("Inisra o lado 3 do triangulo");
				valor = ler.nextDouble();
				triangulo.setLado3(valor);
				System.out.println(triangulo.toString());
				break;
			case 0:
				System.out.println("Obrigado por usar o programa");
			default:
				System.out.println("Operação Invalida");
				break;
			}
			
		} while (op != 0);
		
		ler.close();
	}
	public static void menu()
	{
		System.out.println("1-Circulo");
		System.out.println("2-Quadrado");
		System.out.println("3-Triangulo");
		System.out.println("0-Sair");
		
	}
}
