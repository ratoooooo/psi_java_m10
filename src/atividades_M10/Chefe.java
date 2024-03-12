package atividades_M10;

public class Chefe extends Empregado {
	
	public Chefe(String nome, double salario, int codEmpregado) {
		super(nome, salario, codEmpregado);
	}
	
	public void atributirBonus(double bonus)
	{
		salario += bonus;
	}
	
	@Override
	public String toString() {
		return "**EL BOSS**\n" + super.toString();
		}
}
