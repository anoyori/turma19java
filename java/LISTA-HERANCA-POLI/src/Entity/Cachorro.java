package Entity;

public class Cachorro extends Animal{

	//atributos
	public String deveCorrer;
	
	
	//construtor
	public Cachorro(String nome, int idade, String emiteSom) {
		super(nome, idade, emiteSom);
	}
	
	//métodos
	public String Movimento() {
		return "Cachorro corre";
	}

	@Override
	public String som() {
		return "Emite o som: " + emiteSom;
	}
}
