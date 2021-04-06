package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {

		/*Exercício 5 - Crie um programa que leia um número 
		 * do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero = 0, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextDouble();
			soma = soma + numero;
		}
		
		while(numero != 0);
		System.out.printf("Resultado da soma dos número: %.2f", soma);
	}
	

}
