package lista1;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
// Exercício 7

	Scanner leia = new Scanner(System.in);
	
	double a, b, c, d, x, f, e1, y;
	
	System.out.print("Digite um valor para 'a': ");
	a = leia.nextDouble();
	
	System.out.print("Digite um valor para 'b': ");
	b = leia.nextDouble();
	
	System.out.print("Digite um valor para 'c': ");
	c = leia.nextDouble();
	
	System.out.print("Digite um valor para 'd': ");
	d = leia.nextDouble();
	
	System.out.print("Digite um valor para 'e1': ");
	e1 = leia.nextDouble();
	
	System.out.print("Digite um valor para 'f': ");
	f = leia.nextDouble();
	
	x = (c*e1 - b*f)/(a*e1 - b*d);
	y = (a*f - c*d)/(a*e1 - b*d);
	
	System.out.printf("X = %.2f",x);
	System.out.printf("\nY = %.2f",y);
	
		
		
	}

}
