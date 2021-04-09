package Entities;

public abstract class Estudante {
	
	private int matricula; //só podem ser vistos
	private String cpf; //só podem ser vistos
	private double pontos; //pode ser vista mais só pode ser alterada por metodo
	private boolean status;

	
	//construtor
	public Estudante(String cpf, int matricula) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	//encapsulamento
	public int getMatricula() {
		return matricula;
	}


	/*public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	*/

	public String getCpf() {
		return cpf;
	}

	
	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/


	public double getPontos() {
		return pontos;
	}


	/*public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	*/

	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
    //Métodos
    public void incluirPonto(double valorPonto) {
        this.pontos = this.pontos+ valorPonto;
    }

    public void tirarPonto(double valorPonto) {

        if (pontos >= valorPonto) {
            this.pontos = this.pontos - valorPonto;
        }

        else if (pontos < valorPonto) {
            System.out.println("\nImpossível retirar nota...");
        }

    }

}//fim da classe
