package EXEMPLO;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/*Exercício 4 - Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		*calcule a seguinte expressão:
		* D = (R+S)/2
		* R = (A+B)^2
		* S = (B+C)^2
		 */ 
		
		Scanner leia = new Scanner(System.in);
		
		double A=0, B=0, C=0, D, R, S;
			
		System.out.println("Qual o valor de A? ");
		A = leia.nextDouble();
		
		System.out.println("Qual o valor de B? ");
		B = leia.nextDouble();
		
		System.out.println("Qual o valor de C? ");
		C = leia.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S)/2;
		
		System.out.println("R =  "+S);
		
		System.out.println("S = "+R);

				
		System.out.println("O valor de D é "+D);
		D = leia.nextDouble();
		
	}

}
