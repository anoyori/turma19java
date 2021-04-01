package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Exercício 5 - A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que 
são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes 
grupos de empresas. 
*/
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double indice;
		
		System.out.print("Qual o índice atual? ");
		indice = leia.nextDouble();
		
		if(indice < 0.4  && indice >= 0.3) {
			System.out.print("Grupo 1: suspendam as atividades");
		}
		else if(indice >= 0.4 && indice < 0.5) {
			System.out.print("Grupos 1 e 2: suspendam as atividades");
		}
		else if(indice >= 0.5) {
			System.out.print("Paralização geral de todos os grupos");
		}
		else {
			System.out.print("Índice dentro do aceitável, fique tranquilo");
		}
		
	}

}
