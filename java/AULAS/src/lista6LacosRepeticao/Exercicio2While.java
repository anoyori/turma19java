package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
		
		/*Exercício 3 - Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. Total de pessoas com 
		 * mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, contador21 = 0, contador50 = 0;
		
		while(idade != -99) {
			System.out.print("Qual a sua idade? ");
			idade = leia.nextInt();	
			
			if(idade >= 0 && idade < 21) {
				contador21++;
			}
			else if(idade > 50 && idade > 0) {
				contador50++;
			}
		}
		System.out.printf("Total de pessoas com menos de 21 anos: %d \n", contador21);				
		System.out.printf("Total de pessoas com mais de 50 anos: %d \n", contador50);
	}

}
