package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Exercício 8 - Construa um sistema para ler uma variável
 * numérica N e imprimi-la somente se a mesma for maior que 100,
 * caso contrário imprimi-la com o valor zero.
 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N;
		
		System.out.print("Digite um valor: ");
		N = leia.nextDouble();
		
		if(N>100) {
			System.out.print("N = "+N);
		}
		else {
			System.out.print("N = 0");
		}
		
		
	}

}
