package Entity;

public class Preguica extends Animal{
	
	//atributos
	public String deveCorrer;
	
	//construtor
	public Preguica(String nome, int idade, String emiteSom) {
		super(nome, idade, emiteSom);
	}
	
	//métodos
	public String Movimento() {
		return "Preguiça sobe em árvores";
	}
	
	@Override
	public String som() {
		return "Emite o som: " + emiteSom;
	}
}
