package entities;

public class Produto {

	//encapsulamento: seguran�a total dos dados;
	
	private String descricao;
	private String codigo;     //c�digo n�o pode ser alterado, mas pode ser visto
	private double valorUnitario;
	private int qtdeEstoque; //s� pode ser alterado por m�todo
	
	//construtor: codigo, descri��o e valor unitario - m�nimo de informa��es criar um objeto;
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
	O c�digo n�o poder� ser alterado no programa
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

	//m�todos
	public void incluirEstoque(int valorIncluido) {
		this.qtdeEstoque = this.qtdeEstoque + valorIncluido;
	}
	
	public void tirarEstoque(int valorExcluido) {
		if(qtdeEstoque > valorExcluido) {
		this.qtdeEstoque = this.qtdeEstoque - valorExcluido;
		}
		else {
			System.out.print("Estoque indispon�vel");
		}
	}
	
}
