package lista5LacosDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2LacosDecisao {

	public static void main(String[] args) {

/*Exerc�cio 2 - Fa�a um programa que entre com 
 tr�s n�meros e coloque em ordem crescente.
 */
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leia.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = leia.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		n3 = leia.nextDouble();
		
		//MAIOR NUMERO
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
		}
			else if(n2 > n1 && n2 > n3) {
				System.out.println(n2);
			}
			else if(n3 > n1 && n3 > n2) {
				System.out.println(n3);
			}
		//NUMERO DO MEIO
		if(n1 < n2 && n1 > n3) {
			System.out.println(n1);
		}	
			else if(n2 > n1 && n2 < n3) {
				System.out.println(n2);
			}
			else if(n3 > n1 && n3 < n2) {
				System.out.println(n3);
			}
		//MENOR NUMERO
		if(n1 < n2 && n1 < n3) {
			System.out.print(n1);
		}
			else if(n2 < n1 && n2 < n3) {
				System.out.println(n2);
			}
			else if(n3 < n1 && n3 < n2) {
				System.out.println(n3);
			}

	}

}
