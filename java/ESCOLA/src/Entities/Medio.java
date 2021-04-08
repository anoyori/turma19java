package Entities;

public class Medio extends Estudante {
	
	//atributos
	private int contadorBoletim;

	//construtor
	public Medio(String cpf, int matricula) {
		super(cpf, matricula);
	}

	//encapsulador
	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	//métodos
	public void imprimirBoletim() {
		System.out.print("\nBOLETIM");
		System.out.print("\nPontos Atuais: "+super.getPontos()+"\n");
	}
	
}
