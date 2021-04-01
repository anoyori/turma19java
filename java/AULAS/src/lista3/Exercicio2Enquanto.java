package lista3;

import java.util.Scanner;

public class Exercicio2Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Exercicio 2 - Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/
		Scanner leia = new Scanner(System.in);
		double numero = 0;
		
		System.out.print("Digite um número: ");
		numero = leia.nextDouble();
				
		while(numero < 100) {
			numero = numero * 3;
			System.out.print(numero + "\n");
			
		}
	}

}
