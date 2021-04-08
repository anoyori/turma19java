package entities;

public class Produto {

	//encapsulamento: segurança total dos dados;
	
	private String descricao;
	private String codigo;     //código não pode ser alterado, mas pode ser visto
	private double valorUnitario;
	private int qtdeEstoque; //só pode ser alterado por método
	
	//construtor: codigo, descrição e valor unitario - mínimo de informações criar um objeto;
	public Produto(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	
	//encapsulamento - getter and setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	/*public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	O código não poderá ser alterado no programa
	*/ 

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	/*public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	*/

	//métodos
	public void incluirEstoque(int valorIncluido) {
		this.qtdeEstoque = this.qtdeEstoque + valorIncluido;
	}
	
	public void tirarEstoque(int valorExcluido) {
		if(qtdeEstoque > valorExcluido) {
		this.qtdeEstoque = this.qtdeEstoque - valorExcluido;
		}
		else {
			System.out.print("Estoque indisponível");
		}
	}
	
}
