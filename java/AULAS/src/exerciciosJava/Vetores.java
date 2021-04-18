package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		double [] vect = new double [n];
		
		for(int i = 0; i < n; i++) {
			vect [i] = leia.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		System.out.printf("Average: %.2f",avg);
	}

}
