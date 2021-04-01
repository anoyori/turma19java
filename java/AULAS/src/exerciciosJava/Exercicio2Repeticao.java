package exerciciosJava;

import java.util.Scanner;

public class Exercicio2Repeticao {

	public static void main(String[] args) {
		/*
		 * EXERCICIO 2 - REPETICAO Escreva um programa para ler as coordenadas (X,Y) de
		 * uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto
		 * escrever o quadrante a que ele pertence. O algoritmo será encerrado quando
		 * pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
		 * mensagem alguma).
		 */
		Scanner leia = new Scanner(System.in);
		double x=0.0, y=0.0;

		System.out.print("Digite um valor para X: ");
		x = leia.nextDouble();

		System.out.print("Digite um valor para Y: ");
		y = leia.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.print("Q1\n");
			} else if (x < 0 && y > 0) {
				System.out.print("Q2\n");
			} else if (x < 0 && y < 0) {
				System.out.print("Q3\n");
			} else if (x > 0 && y < 0) {
				System.out.print("Q4\n");
			}
			System.out.print("Digite um valor para X: ");
			x = leia.nextDouble();

			System.out.print("Digite um valor para Y: ");
			y = leia.nextDouble();
		}
		System.out.print("Fim do programa");
	}
}
