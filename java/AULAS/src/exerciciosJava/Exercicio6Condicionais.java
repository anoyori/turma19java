package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Você deve fazer um programa que leia um valor qualquer 
*e apresente uma mensagem dizendo em qual dos seguintes intervalos
*([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
*Obviamente se o valor não estiver em nenhum destes intervalos,
* deverá ser impressa a mensagem “Fora de intervalo”.
 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double numero;
				
		System.out.print("Digite um número entre 0 e 100: ");
		numero = leia.nextDouble();
		
		if(numero >= 0 && numero <= 25) {
			System.out.print("[0,25]");
		}
			else if(numero > 25 && numero <= 50) {
				System.out.print("[25,50]");
			}
			else if(numero > 50 && numero <= 75) {
				System.out.print("[50,75]");
			}
			else if(numero > 75 && numero <= 100) {
				System.out.print("[75,100]");
			}
		else {
			System.out.print("Fora do intervalo");
		}
		leia.close();
	}

}
