package Entity;

public class Preguica extends Animal{
	
	//atributos
	public String deveCorrer;
	
	//construtor
	
	
	//m�todos
	public String Movimento() {
		return "Pregui�a sobe em �rvores";
	}
	
	public Preguica(String nome, int idade, String emiteSom) {
		super(nome, idade, emiteSom);
	}
	
	public String Som() {
		return "a mimir...";
	}

}
