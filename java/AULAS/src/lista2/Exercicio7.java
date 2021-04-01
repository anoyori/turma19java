package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Exercício 7 - Receber valores de base e altura de um triângulo
 *e verificar se são valores válidos (positivos maiores que zero). 
 *Em caso afirmativo, calcular a área do triângulo.
 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double base, altura, area;
		
		System.out.print("Digite um valor para altura: ");
		altura = leia.nextDouble();
		
		System.out.print("Digite um valor para base: ");
		base = leia.nextDouble();
		
		if(base > 0 && altura >0) {
			area = (base*altura)/2;
			System.out.printf("Área é %.2f cm2", area);	
		}
		else {
			System.out.print("Não é possível calcular área com valores negativos");
		}
	}

}
