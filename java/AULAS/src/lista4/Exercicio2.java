package lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
/*Exerc�cio 2 - Um dado � lan�ado 10 vezes e o valor correspondente 
� anotado. Fa�a um programa que gere um vetor com os lan�amentos, 
escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica 
dos lan�amentos, contabilize e apresente tamb�m quantas foram as 
ocorr�ncias da maior pontua��o.
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
		System.out.printf("\nM�dia: %.2f", media);
		System.out.printf("\nMaior valor: %d apareceu %d vezes", maiorValor, contador);
	}
}
