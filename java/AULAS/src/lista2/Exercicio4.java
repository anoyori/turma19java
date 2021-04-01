package lista2;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
	
	/* Exercício 4 - Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
	se este número é par ou ímpar, e se é positivo ou negativo.
	 */
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero == 0) {
			System.out.print("Zero é um número neutro");		
			}else if(numero %2 == 0) {
				System.out.printf("O número %d é par", numero);
			}
			else {
				System.out.printf("O número %d é impar", numero);
			}
		if(numero > 0) {
			System.out.print(" e positivo");
		}
		else if(numero < 0) {
			System.out.print(" e negativo");
		}
		
	}
}
