package entities;

public class Bebida extends Produto{

	private String fabricante;

	//construtor
	public Bebida(String descricao, String codigo, double valorUnitario, String fabricante) {
		super(descricao, codigo, valorUnitario);
		this.fabricante = fabricante;
	}
	
	//encapsulamento
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	
}
