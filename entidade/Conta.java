package br.com.marcos.sistemabancario.entidade;

public class Conta {
	private double saldo;
	private String numero;
	private Cliente cliente;
		
	public Conta(double saldo, String numero, Cliente cliente) {
		this.saldo = saldo;;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}



	public double getSaldo() {
		return saldo;
	}

	public void debitar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void transferir(Conta destino, double valor) {
		if(saldo >= valor) {
			debitar(valor);
			destino.creditar(valor);
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
}
