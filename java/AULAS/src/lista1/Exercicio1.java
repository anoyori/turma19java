package lista1;

	import java.util.Scanner;

	public class Exercicio1 {

		public static void main(String[] args) {

	/*Exerc�cio 1 - Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias. 
	 */

			Scanner leia = new Scanner(System.in);
			
			int idadeAnos;
			int idadeMeses;
			int idadeDias;
			int totalDias;
			
			System.out.print("Qual a sua idade? ");
			idadeAnos = leia.nextInt();
			
			System.out.print("Quantos meses? ");
			idadeMeses = leia.nextInt();
			
			System.out.print("Quantos dias? ");
			idadeDias = leia.nextInt();
			
			totalDias = (idadeAnos*365) + (idadeMeses*30) + idadeDias;
			System.out.println("Sua idade em dias � " + totalDias);
			
		}
}
