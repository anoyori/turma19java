package exerciciosJava;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 1) Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre 
os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um valor: ");
		x = leia.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
			
	}

}
