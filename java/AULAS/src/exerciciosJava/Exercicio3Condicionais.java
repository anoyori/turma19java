package exerciciosJava;

import java.util.Scanner;

public class Exercicio3Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
		int A, B;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número para A: ");
		A = leia.nextInt();
		
		System.out.print("Digite um número para B: ");
		B = leia.nextInt();
		
		if(A%B == 0 || B%A == 0) {
			System.out.printf("Os números %d e %d são multiplos", A, B);
		}
		else {
			System.out.printf("Os números %d e %d não são multiplos", A, B);
			
		}
	}

}
