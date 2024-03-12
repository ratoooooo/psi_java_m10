package atividades_M10;

public class Atividade2 {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Pedro", 1000, 234);
		Chefe chefe = new Chefe("Dinis", 6786, 3);

		System.out.println("---Antes do Aumento---");
		System.out.println(empregado.toString());
		System.out.println(chefe.toString());
		
		empregado.aumentaOrdenado(7);
		chefe.atributirBonus(25);
		
		System.out.println("---Depois do Aumento---");
		System.out.println(empregado.toString());
		System.out.println(chefe.toString());
		
		
	}

}
