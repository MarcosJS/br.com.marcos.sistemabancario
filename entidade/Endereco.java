package br.com.marcos.sistemabancario.entidade;

public class Endereco {
	private String numero;
	private String rua;
	private String bairro;
	private String cep;
	
	public Endereco(String numero, String rua, String bairro, String cep) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	public Endereco() {
		numero = "desconhecido";
		rua = "desconhecido";
		bairro = "desconhecido";
		cep = "desconhecido";
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
}
