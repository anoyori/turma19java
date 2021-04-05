package EXEMPLO;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); //instanciado o tipo de decimal
		Locale.setDefault(Locale.US);
		
		int numero; //numero inteiro
		
		//System.out.print("Digite um número: ");
		//numero = leia.nextInt();
		//parImpar(numero);
		
		parImpar(-4);
		parImpar(0);
		parImpar(5);
		parImpar(22);
				
		System.out.print("\nFim de programa\n");
		escreveLinha();
	}
	
	public static void parImpar(int numero) {
		if((numero%2) == 0 && numero >= 0) {
			System.out.println("Número par");
			escreveLinha();
		}
		else if ((numero%2) == 1 && numero > 0){
			System.out.println("Número impar");
			escreveLinha();
		}
	}
	
	public static void escreveLinha() {
		System.out.println("-------------------------------------------");
	}

}
