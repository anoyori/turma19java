package Entities;

public class Basico extends Estudante {
	
	//atributos
	private int diaAniversario;

	//construtores
	public Basico(String cpf, int matricula, int diaAniversario) {
		super(cpf, matricula);
		this.diaAniversario = diaAniversario;
	}

	//encapsulamento
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//metodo
	public void bonusAniversario(int diaAtual) {
		if(diaAniversario == diaAtual) {
			super.incluirPonto(super.getPontos() * 0.10);

		}
	}

}
