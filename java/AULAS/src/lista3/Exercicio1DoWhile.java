package lista3;

import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {
/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, 
 só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 
 quando não estiver.
 */

		Scanner leia = new Scanner(System.in);
		int x = 233;
		
		do {
			if(x >= 300 && x <= 400) {
				System.out.print(x + "\n");	
				x = x + 3;
			}
			else {
				System.out.print(x + "\n");
				x = x + 5;
			}
		}
		
		while(x >= 233 && x <= 456);
	}	

}
