package applications;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = leia.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double bought = leia.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.dollarToReal(dollar, bought));

	}

}
