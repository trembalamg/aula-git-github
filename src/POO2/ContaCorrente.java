package POO2;

public class ContaCorrente {
	private int numero, agencia;
	private double saldo;

	public void inicializarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}

	public void sacar(double valor) {
		if (valor < this.saldo) {
			saldo = saldo - valor;
		} else
			System.out.println("Saldo insuficiente");

	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return (saldo);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}