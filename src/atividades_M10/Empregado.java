package atividades_M10;

public class Empregado {
	public String nome;
	public double salario;
	public int codEmpregado;

	public Empregado(String nome, double salario, int codEmpregado) {
		this.nome = nome;
		this.salario = salario;
		this.codEmpregado = codEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCodEmpregado() {
		return codEmpregado;
	}

	public void setCodEmpregado(int codEmpregado) {
		this.codEmpregado = codEmpregado;
	}

	public double aumentaOrdenado(int percAumento) {
		double aumento = this.salario * (percAumento / 100.0);
		 return this.salario = this.salario + aumento;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCodigo: " + codEmpregado + "\nSalario: " + salario;
	}
}



