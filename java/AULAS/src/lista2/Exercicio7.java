package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Exerc�cio 7 - Receber valores de base e altura de um tri�ngulo
 *e verificar se s�o valores v�lidos (positivos maiores que zero). 
 *Em caso afirmativo, calcular a �rea do tri�ngulo.
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
			System.out.printf("�rea � %.2f cm2", area);	
		}
		else {
			System.out.print("N�o � poss�vel calcular �rea com valores negativos");
		}
	}

}
