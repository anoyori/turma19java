package lista4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

/*Exercício 1 - Faça um programa que crie um vetor por leitura com 5 
valores de pontuação de uma atividade e o escreva em seguida. Encontre 
após a maior pontuação e a apresente. 
*/
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = 5;
		double maiorValor = 0;
		double pontos [] = new double [n];
		
		for(int i=0; i<5; i++) {
			System.out.print("Digite a pontuação: ");
			pontos[i] = leia.nextDouble();
			
			if(maiorValor < pontos[i]) {
				maiorValor = pontos[i];
			}
		}
		System.out.print("Maior pontuação: " + maiorValor);
	}

}
