package lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
/*Exercício 2 - Um dado é lançado 10 vezes e o valor correspondente 
é anotado. Faça um programa que gere um vetor com os lançamentos, 
escreva esse vetor. A seguir determine e imprima a média aritmética 
dos lançamentos, contabilize e apresente também quantas foram as 
ocorrências da maior pontuação.
 */
		Scanner leia = new Scanner(System.in);
		
		int lancamento [] = new int [10];
		double media, soma = 0;
		int contador = 0, maiorValor = 0;
		
		System.out.println("Valores do dado: ");
		
		for(int i=0; i<10; i++) {
			if(lancamento[i] <= 6 ) {
			lancamento[i] = (int) ((Math.random()*6)+1);
			System.out.print(lancamento[i] + " ");
			soma = soma + lancamento[i];
			}
				if(maiorValor < lancamento[i]) {
					maiorValor = lancamento[i];
					contador = 1;
				}
				else if(maiorValor == lancamento[i]) {
					maiorValor = lancamento[i];
					contador++;
				}
		}
		media = soma / 10;
		System.out.printf("\nMédia: %.2f", media);
		System.out.printf("\nMaior valor: %d apareceu %d vezes", maiorValor, contador);
	}
}
