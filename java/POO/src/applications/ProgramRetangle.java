package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Retangle rectangle = new Retangle();
		
		System.out.print("Enter rectangle width(cm): ");
		rectangle.width = leia.nextDouble();
		
		System.out.print("Enter rectangle height(cm): ");
		rectangle.height = leia.nextDouble();
		
		System.out.printf("Area(cm^2) = %.2f\n", rectangle.area());
		System.out.printf("Perimeter(cm) = %.2f\n", rectangle.perimeter());
		System.out.printf("Diagonal(cm) = %.2f\n", rectangle.diagonal());
		
	}

}
