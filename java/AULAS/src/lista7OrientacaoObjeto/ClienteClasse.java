package lista7OrientacaoObjeto;

public class ClienteClasse {

	public String nome;
	public int anoNascimento;
	public String cpf;
	
	//m�todo
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}

}