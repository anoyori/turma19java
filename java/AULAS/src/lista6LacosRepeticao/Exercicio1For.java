package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {

	/*Exercício 1 - Informar todos os números de 1000 a 1999 que 
	 * quando divididos por 11 obtemos resto = 5. (FOR)
	 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		for(int i=1000; i<=1999; i++) {
		if(i%11 == 5) {
			System.out.println(i);
			}
		}		
	}

}
