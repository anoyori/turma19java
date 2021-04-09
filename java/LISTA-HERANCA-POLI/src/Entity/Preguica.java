package Entity;

public class Preguica extends Animal{
	
	//atributos
	public String deveCorrer;
	
	//construtor
	public Preguica(String nome, int idade, String emiteSom) {
		super(nome, idade, emiteSom);
	}
	
	//m�todos
	public String Movimento() {
		return "Pregui�a sobe em �rvores";
	}
	
	@Override
	public String som() {
		return "Emite o som: " + emiteSom;
	}
}
