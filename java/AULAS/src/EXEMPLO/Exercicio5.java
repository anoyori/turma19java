package EXEMPLO;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
/* Exerc�cio 5 - Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final
 * deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
 */

		
		Scanner leia = new Scanner(System.in);

		double p1, p2, p3, n1, n2, n3, media;
		
		p1 = 2;
		p2 = 3;
		p3 = 5;
		
		System.out.print("Qual a nota 1? ");
		n1 = leia.nextDouble();
		
		System.out.print("Qual a nota 2? ");
		n2 = leia.nextDouble();
		
		System.out.print("Qual a nota 3? ");
		n3 = leia.nextDouble();
		
		
		media = (((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3));
		System.out.print("\nSua m�dia ponderada � "+media);
	}

}