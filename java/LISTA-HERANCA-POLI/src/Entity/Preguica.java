package Entity;

public class Preguica extends Animal{
	
	//atributos
	public String deveCorrer;
	
	//construtor
	
	
	//métodos
	public String Movimento() {
		return "Preguiça sobe em árvores";
	}
	
	public Preguica(String nome, int idade, String emiteSom) {
		super(nome, idade, emiteSom);
	}
	
	public String Som() {
		return "a mimir...";
	}

}
