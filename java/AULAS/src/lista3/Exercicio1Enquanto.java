package lista3;

import java.util.Scanner;

public class Exercicio1Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.	 
*/
		Scanner leia = new Scanner(System.in);
		double valor = 0, media, soma = 0;
		int contador = 0;
			
		//System.out.print("Informe um valor: ");
		//valor = leia.nextDouble();
		
		while(valor >= 0) {
			soma = soma + valor;
			System.out.print("Informe um valor: ");
			valor = leia.nextDouble();
			contador = contador + 1;
		}
			contador = contador - 1;
			System.out.print("\nSoma dos valores: " + soma);
			media = soma / contador;
			System.out.println("\nM�dia dos valores: " + media);
			System.out.print("Quantidade de n�meros lidos: " + contador);
		
	}

}
