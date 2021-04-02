package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.
 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		double [] vect = new double [n];
		
		for(int i=0; i<n; i++) {
			vect[i] = leia.nextDouble();
		}
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		double media = soma/n;
		
		System.out.printf("Média de altura: %.2f", media);
	}

}
