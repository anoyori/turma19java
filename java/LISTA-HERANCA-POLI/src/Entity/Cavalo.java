package Entity;

public class Cavalo extends Animal {

	
	//atributos
	public String deveCorrer;


	//construtor
	public Cavalo(String nome, int idade, String emiteSom) {
		super(nome, idade, emiteSom);
	}

	//m?todos
	public String Movimento() {
		return "Cavalo corre";
	}
	
	@Override
	public String som() {
		return "Emite o som: " + emiteSom;
	}
	
}
