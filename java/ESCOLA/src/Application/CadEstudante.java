package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Basico;
import Entities.Medio;

public class CadEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		char opcao;
		
		do {
		System.out.print("[COLÉGIO SANTA AMANDA]\n[ESCOLA DOS LOUCOS]");
		System.out.print("\n1 - BÁSICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
		System.out.print("\nDIGITE O CODIGO DA OPÇÃO SELECIONADA: _");
		opcao = leia.next().charAt(0);
		
		if(opcao == '1') {
			System.out.print("Digite a matrícula do aluno: ");
			int matricula = leia.nextInt();
			System.out.print("Digite a CPF do aluno: ");
			String cpf = leia.next();
			System.out.print("Digite o dia do aniversário do aluno: ");
			int diaAniversario = leia.nextInt();
			Basico aluno = new Basico(cpf, matricula, diaAniversario);
			
			System.out.print("Digite a nota: ");
			double nota = leia.nextDouble();
			aluno.incluirPonto(nota);
			
			if(aluno.getPontos() <= 5) {
				System.out.print("Ainda não");
			}
			else {
				System.out.print("Parabéns");
			}
			
			System.out.print("Qual o dia de hoje?");
			int diaAtual = leia.nextInt();
			aluno.bonusAniversario(diaAtual);
			
			System.out.print("Pontos atuais: "+aluno.getPontos());
			System.out.print("\nContinua 1 - Sim ou 6 - Não");
			opcao = leia.next().charAt(0);
		}
		else if(opcao == '2') {
			System.out.print("Digite a matrícula do aluno: ");
			int matricula = leia.nextInt();
			System.out.print("Digite a CPF do aluno: ");
			String cpf = leia.next();
			
			Medio aluno = new Medio(cpf,matricula);
			System.out.print("Digite a nota: ");
			double nota = leia.nextDouble();
			aluno.incluirPonto(nota);
			
			if(aluno.getPontos() <= 5) {
				System.out.print("Ainda não\n");
				linha();
			}
			else {
				System.out.print("Parabéns\n");
				linha();
			}
			aluno.imprimirBoletim();
			System.out.print("\nContinua 1 - Sim ou 6 - Não");
			opcao = leia.next().charAt(0);
							
		}
		}
		while(opcao != '6');
		linha();
		System.out.print("\nFIM DO PROGRAMA");
		
		
		/*Estudante fulano = new Estudante("012.345.678-99", 12345);	
		
		System.out.println(fulano.getMatricula());
		System.out.println(fulano.getCpf());
		
		fulano.adicionarNota(10);
		System.out.printf("A nota de fulano é %.2f." , fulano.getPontos());
		
		fulano.tirarNota(11);
		
		System.out.printf("\nA nota de fulano é %.2f" , fulano.getPontos());	
	*/
	}

	public static void linha() {
		System.out.print("----------------------------------------------");
	}
		
}


