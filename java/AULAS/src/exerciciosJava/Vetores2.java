package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class Vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		Product [] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			String name = leia.next();
			double price = leia.nextDouble();
			vect[i] = new Product(name,price);
		}

		double sum = 0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		System.out.print("Average price: "+avg);
	}

}
