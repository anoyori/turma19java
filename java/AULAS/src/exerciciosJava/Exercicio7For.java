package exerciciosJava;

import java.util.Scanner;

public class Exercicio7For {

	public static void main(String[] args) {
/* 7) Fazer um programa para ler um n�mero inteiro positivo N. 
O programa deve ent�o mostrar na tela N linhas, come�ando de 1 
at� N. Para cada linha, mostrar o n�mero da linha, depois o 
quadrado e o cubo do valor, conforme exemplo.
 */
		Scanner leia = new Scanner(System.in);
		
		double linhas, quad1, cubo1;
		
		System.out.print("Digite o n�mero de linhas: ");
		linhas = leia.nextInt();
		
		for(double i = 1; i <= linhas; i++) {
			quad1 = Math.pow(i, 2);
			cubo1 = Math.pow(i, 3);
			
			System.out.print(i + " " + quad1 + " " + cubo1 + "\n");
			
		}

	}

}
