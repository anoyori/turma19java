package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Leia 2 valores com uma casa decimal (x e y), que devem representar 
as coordenadas de um ponto em um plano. A seguir, determine qual 
o quadrante ao qual pertence o ponto, ou se está sobre um dos 
eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x, y;
		
		System.out.print("Digite um valor para X: ");
		x = leia.nextDouble();
		
		System.out.print("Digite um valor para Y: ");
		y = leia.nextDouble();
		
		if(x == 0 && y == 0){
			System.out.print("Origem");
		}
			else if(x == 0){
				System.out.print("Eixo X");
			}
			else if(y == 0){
				System.out.print("Eixo Y");
			}
			else if(x > 0 && y > 0){
				System.out.println("Q1");
			}
			else if(x < 0 && y > 0){
				System.out.println("Q2");
			}
			else if(x < 0 && y < 0){
				System.out.println("Q3");
			}
			else if(x > 0 && y < 0){
				System.out.println("Q4");
			}
	}

}
