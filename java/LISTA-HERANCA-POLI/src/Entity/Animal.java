package Entity;

public class Animal {

	//atributos
	public String nome;
	public int idade;
	public String emiteSom;
	
	public Animal() {
		
	}
	
	public Animal(String nome, int idade, String emiteSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
	}

	//metodo
	public String som() {
		return "Emite o som: ";
	}
}
