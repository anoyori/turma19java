package lista3;

import java.util.Scanner;

public class Exercicio2DoWhile {

	public static void main(String[] args) {
/*2- Fa�a um programa que pegue um n�mero do teclado e 
calcule a soma de todos os n�meros de 1 at� ele. Ex.: o usu�rio 
entra 7, o programa vai mostrar 28, pois 1+2+3+4+5+6+7=28.
*/
		Scanner leia = new Scanner(System.in);
		
		int x, soma = 0, n = 0;
		
		System.out.print("Digite um n�mero: ");
		x = leia.nextInt();
		
		do {
			soma = soma + n;
			n++;
		}
		while(n <= x);
			System.out.print("Resultado: " + soma);
	}

}
