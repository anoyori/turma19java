package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ProgramaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.print("Enter the measures of triangle X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.print("Enter the measures of triangle Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX < areaY) {
			System.out.print("Larger area: X");
		}
		else {
			System.out.print("Larger area: Y");
		}
	}

}
