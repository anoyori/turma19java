package lista7OrientacaoObjeto;

public class ClienteClasse {

	public String nome;
	public int anoNascimento;
	public String cpf;
	
	//método
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}

}