package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {

		/*Exerc�cio 5 - Crie um programa que leia um n�mero 
		 * do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero = 0, soma = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextDouble();
			soma = soma + numero;
		}
		
		while(numero != 0);
		System.out.printf("Resultado da soma dos n�mero: %.2f", soma);
	}
	

}
