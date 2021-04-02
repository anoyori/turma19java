package exerciciosJava;

import java.util.Scanner;

public class Exercicio7For {

	public static void main(String[] args) {
/* 7) Fazer um programa para ler um número inteiro positivo N. 
O programa deve então mostrar na tela N linhas, começando de 1 
até N. Para cada linha, mostrar o número da linha, depois o 
quadrado e o cubo do valor, conforme exemplo.
 */
		Scanner leia = new Scanner(System.in);
		
		double linhas, quad1, cubo1;
		
		System.out.print("Digite o número de linhas: ");
		linhas = leia.nextInt();
		
		for(double i = 1; i <= linhas; i++) {
			quad1 = Math.pow(i, 2);
			cubo1 = Math.pow(i, 3);
			
			System.out.print(i + " " + quad1 + " " + cubo1 + "\n");
			
		}

	}

}
