package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {

/*Exercício 2 - Ler 10 números e imprimir quantos
 são pares e quantos são ímpares. (FOR)
 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contaPar = 0, contaImpar = 0;
		
		for(int i=0; i<10; i++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero%2 == 0) {
				contaPar++;
			}
			else if(numero%2 != 0) {
				contaImpar++;
			}
		}
		System.out.printf("Números pares: %d", contaPar);
		System.out.printf("\nNúmeros ímpares: %d", contaImpar);
	}

}
