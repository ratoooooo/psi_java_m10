package atividades_M10;

public class ContaGeral implements Conta {

	double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void deposite(double valor) {
		saldo += valor;
	}

	@Override
	public void levante(double valor) {
		if(valor > saldo)
		{
			System.out.println("Nao pode retirar mais do q tem");
		}
		else
		{
			saldo -= valor;
		}
		
	}
	
	public String toString()
	{
		return "Saldo: " + saldo;
 	}
}
