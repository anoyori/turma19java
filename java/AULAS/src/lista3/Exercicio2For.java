package lista3;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
/*2- Desenvolver um sistema que efetue a soma de todos os números 
ímpares que são  múltiplos de três e que se encontram no conjunto
dos números de 1 até 500.
 */

		Scanner leia = new Scanner(System.in);
		
		int soma = 0, x;
		
		for(x = 1; x <= 500; x++) {
			if(x %2 != 0 && x %3 == 0) {
				soma = soma + x;
			}
		}
		System.out.printf("Resultado da soma: %d", soma);
	}

}
