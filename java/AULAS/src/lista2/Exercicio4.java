package lista2;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
	
	/* Exerc�cio 4 - Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando 
	se este n�mero � par ou �mpar, e se � positivo ou negativo.
	 */
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if(numero == 0) {
			System.out.print("Zero � um n�mero neutro");		
			}else if(numero %2 == 0) {
				System.out.printf("O n�mero %d � par", numero);
			}
			else {
				System.out.printf("O n�mero %d � impar", numero);
			}
		if(numero > 0) {
			System.out.print(" e positivo");
		}
		else if(numero < 0) {
			System.out.print(" e negativo");
		}
		
	}
}
