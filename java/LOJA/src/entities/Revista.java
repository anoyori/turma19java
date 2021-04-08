package entities;

public class Revista extends Produto {

	private String editora;

	//construtor
	public Revista(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}
	
	//encapsulamento

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	

	
	
}
