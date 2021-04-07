package Classes;

public class Pessoa {
	
	//classe nome
	//inicio
	//atributos [é/tem/estar]
	public String nome;
	public int anoNascimento;
	public char genero;
	
	//metodos [faz]
	public int calcularIdade() {
		return 2021 - anoNascimento;
	}
	//sobrecarga
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	public String tratamento() {
		String saida="";
		if(genero == '1') {
			saida = "Sra.";
		}
		else if(genero == '2') {
			saida = "Sr.";
		}
		else if(genero == '3') {
			saida = "Sre.";
		}
		return saida;
	}
	
	public String trazArtigo() {
		String saida="";
		if(genero == '1') {
			saida = "a";
		}
		else if(genero == '2') {
			saida = "o";
		}
		else if(genero == '3') {
			saida = "e";
		}
		return saida;
	}
	
	//fim

}
