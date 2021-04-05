package EXEMPLO;

import java.util.Scanner;

public class Troca2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//2 valores inverte-los
		
		int valor1, valor2;
		
		System.out.println("Valor A:");
		valor1 = leia.nextInt();
		System.out.println("Valor B:");
		valor2 = leia.nextInt();
		
		valor1 = valor1 + valor2;
		valor2 = valor1 - valor2;
		valor1 = valor1 - valor2;
		
		System.out.println("Valor A: " + valor1);
		System.out.println("Valor B: " + valor2);

	}

}
