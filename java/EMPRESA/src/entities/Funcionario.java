package entities;

public class Funcionario {
	
	private String matricula;
	private String nome;
	protected int horasTrabalhadas; //protected fica dispon�vel para as subclasses
	protected double valorHora;
	
	//construtor
	public Funcionario(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	//sobrecarga
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	//encapsulamento
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//m�todo
	public double salario() {
		return horasTrabalhadas*valorHora;
	}

}
