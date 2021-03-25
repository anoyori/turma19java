package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	
/*Exercicio 6 - Construa um programa em c que, tendo como dados de entrada dois pontos
*quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		double x1=0, x2=0, y1=0, y2=0, d, potenciaX,potenciaY;
		
		System.out.print("Qual o valor de X1? ");
		x1 = leia.nextDouble();
		
		System.out.print("Qual o valor de X2? ");
		x2 = leia.nextDouble();
		
		System.out.print("Qual o valor de Y1? ");
		y1 = leia.nextDouble();
		
		System.out.print("Qual o valor de Y2? ");
		y2 = leia.nextDouble();
		
		potenciaX = Math.pow((x2-x1),2);
		potenciaY = Math.pow((y2-y1),2);
		d = Math.sqrt(potenciaX+potenciaY);

		System.out.printf("\nd = %.2f",d);
				
	}

}
