package entities;

public class Loja {
	
	private String nome;	
	private String cnpj;
	
	//construtor
	public Loja(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
