package Entity;

public class Cachorro extends Animal{

	//atributos
	public String deveCorrer;
	
	//sobrecarga
	public Cachorro() {
		
	}
	
	//construtor
	public Cachorro(String nome, int idade, String emiteSom, String deveCorrer) {
		super(nome, idade, emiteSom);
		this.deveCorrer = deveCorrer;
	}
	
	//métodos
	public String Movimento() {
		return "Cachorro corre";
	}
	public String Som() {
		return "AuAu!";
	}
}
