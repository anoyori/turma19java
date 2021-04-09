package Entities;

public class Graducao extends Estudante {
	
	private double bonus;

	//construtores
	public Graducao(String cpf, int matricula) {
		super(cpf, matricula);
	}

	//encapsuladores
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//metodo
	public void ajustaBonus(int incluiBonus) {
		double contador=0, somaPontos=0, media;
		contador++;
		somaPontos = somaPontos + super.getPontos();
		media = somaPontos / contador;
		
		for(int i=0; i<2; i++) {
			if(media < 0) {
				media = media + incluiBonus;
				incluiBonus--;
			}
		}
	}
}
