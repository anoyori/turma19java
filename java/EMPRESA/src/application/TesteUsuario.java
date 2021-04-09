package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		java.util.List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("CADASTRO DE FUNCIONÁRIO - PAGAMENTOS");
		System.out.print("\nQuantos funcionários serão cadastrados?");
		int qtde = leia.nextInt();
		
		for(int i=1; i<=qtde; i++) {
			System.out.printf("Funcionário %d\n", i);
			System.out.print("Digite: 1 - Funcionário e 2 - Terceiro");
			char tipo = leia.next().charAt(0) ;
			
			System.out.print("Digite a matrícula: ");
			String matricula = leia.next();
			
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			
			System.out.print("Quantas horas trabalhou?");
			int horasTrabalhadas = leia.nextInt();
			
			System.out.print("Qual o valor por hora trabalhada?" );
			double valorHora = leia.nextDouble();
			
			if(tipo == '2') {
				System.out.print("Digite o valor do adicional: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional));
			}
			else {
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora));
			}
			System.out.println();
			System.out.println("FOLHA DE PAGAMENTOS");
			//for each
			for(Funcionario func: lista) {
				System.out.println(func.getNome()+" salario R$"+func.salario());
			}
		}
		
		

	}

}
