package exerciciosJava;

import java.util.Scanner;

public class Exercicio3Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
 */
		int A, B;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para A: ");
		A = leia.nextInt();
		
		System.out.print("Digite um n�mero para B: ");
		B = leia.nextInt();
		
		if(A%B == 0 || B%A == 0) {
			System.out.printf("Os n�meros %d e %d s�o multiplos", A, B);
		}
		else {
			System.out.printf("Os n�meros %d e %d n�o s�o multiplos", A, B);
			
		}
	}

}
