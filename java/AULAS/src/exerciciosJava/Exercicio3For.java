package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3For {

	public static void main(String[] args) {

/*3) Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); 
		
		int n;
		double nota1, nota2, nota3, mediaPonderada = 0;
		
		System.out.print("Digite a quantidade testes: ");
		n = leia.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.print("\nTeste " + i);
			System.out.print("\nDigite a primeira nota: ");
			nota1 = leia.nextDouble();
			
			System.out.print("Digite a segunda nota: ");
			nota2 = leia.nextDouble();
			
			System.out.print("Digite a terceira nota: ");
			nota3 = leia.nextDouble();
			
			mediaPonderada = ((nota1*2) + (nota2*3) + (nota3*5))/10;
			System.out.printf("Média ponderada = %.1f", mediaPonderada);
			System.out.println("");
		}

			
	}

}
