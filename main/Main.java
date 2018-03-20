package br.com.marcos.sistemabancario.main;

import br.com.marcos.sistemabancario.entidade.*;;

public class Main {
	
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente("fulano", "07717824469", endereco);
		Conta conta = new Conta(2500,"0000001", cliente);
		conta.creditar(3755.80);
		conta.debitar(745.90);
		double s1 = conta.getSaldo();
		String nome = conta.getCliente().getNome();
		String numeroConta = conta.getNumero();
		System.out.println("CONTA "+numeroConta+"\n\n");
		System.out.printf("Titular: "+nome+"\t\t\tSaldo :%.2f", s1);
	}
}
