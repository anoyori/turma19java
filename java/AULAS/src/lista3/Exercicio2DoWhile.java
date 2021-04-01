package lista3;

import java.util.Scanner;

public class Exercicio2DoWhile {

	public static void main(String[] args) {
/*2- Faça um programa que pegue um número do teclado e 
calcule a soma de todos os números de 1 até ele. Ex.: o usuário 
entra 7, o programa vai mostrar 28, pois 1+2+3+4+5+6+7=28.
*/
		Scanner leia = new Scanner(System.in);
		
		int x, soma = 0, n = 0;
		
		System.out.print("Digite um número: ");
		x = leia.nextInt();
		
		do {
			soma = soma + n;
			n++;
		}
		while(n <= x);
			System.out.print("Resultado: " + soma);
	}

}
