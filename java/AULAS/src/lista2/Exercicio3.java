package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Exercício 3 - Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		* 
		*/
		
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, quad1, quad2, quad3, quad4;
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextDouble();
		quad1 = Math.pow(n1, 2);
		
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextDouble();
		quad2 = Math.pow(n2, 2);
		
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextDouble();
		quad3 = Math.pow(n3, 2);
		
		System.out.print("Digite o quarto número: ");
		n4 = leia.nextDouble();
		quad4 = Math.pow(n4, 2);
		
		if(quad3 >= 1000) {
			System.out.printf("%nO quadrado do %.1f é igual a %.1f", n3, quad3);
		}
		
		else {
		System.out.printf("%nO quadrado do %.1f é igual a %.1f", n1, quad1);
		System.out.printf("%nO quadrado do %.1f é igual a %.1f", n2, quad2);
		System.out.printf("%nO quadrado do %.1f é igual a %.1f", n3, quad3);
		System.out.printf("%nO quadrado do %.1f é igual a %.1f", n4, quad4);
		}
		
	}

}
