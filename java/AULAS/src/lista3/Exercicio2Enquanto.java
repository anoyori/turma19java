package lista3;

import java.util.Scanner;

public class Exercicio2Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Exercicio 2 - Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por
tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio
digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
*/
		Scanner leia = new Scanner(System.in);
		double numero = 0;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextDouble();
				
		while(numero < 100) {
			numero = numero * 3;
			System.out.print(numero + "\n");
			
		}
	}

}
