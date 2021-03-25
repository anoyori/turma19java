package EXEMPLO;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {

/*Exercício 2 - Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a 
 * expressa em anos, meses e dias. 
 */
		
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		int totalDias;
		
		System.out.print("Digite sua idade em dias: ");
		totalDias = leia.nextInt();
		
		idadeAnos = totalDias/365;
		idadeMeses = totalDias%365/30;
		idadeDias = totalDias%365%30;
		
		System.out.println("Você tem "+idadeAnos+" anos, "+idadeMeses+" meses e "+idadeDias+" dias.");

	}

}
