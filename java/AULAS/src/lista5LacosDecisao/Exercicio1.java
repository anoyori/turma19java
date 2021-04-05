package lista5LacosDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

/*Exercício 1 - Faça um programa que receba três 
inteiros e diga qual deles é o maior.
*/

		Scanner leia = new Scanner(System.in);
		
		int numero, maiorNumero = 0;
		
		for(int i=0; i<3; i++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if(maiorNumero < numero) {
				maiorNumero = numero;
			}
		}
		System.out.printf("O maior valor é %d", maiorNumero);

	}

}
