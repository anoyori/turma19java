package lista5LacosDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

/*Exerc�cio 1 - Fa�a um programa que receba tr�s 
inteiros e diga qual deles � o maior.
*/

		Scanner leia = new Scanner(System.in);
		
		int numero, maiorNumero = 0;
		
		for(int i=0; i<3; i++) {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if(maiorNumero < numero) {
				maiorNumero = numero;
			}
		}
		System.out.printf("O maior valor � %d", maiorNumero);

	}

}
