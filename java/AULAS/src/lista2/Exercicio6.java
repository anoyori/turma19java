package lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Exerc�cio 6 - Elabore um sistema que dada a idade de um nadador classifique-o 
		* em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		*/
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.print("Classifica��o: infatil A");
		}
			else if(idade >= 8 && idade <= 11) {
				System.out.print("Classifica��o: infatil B");
			}
			else if(idade >= 12 && idade <= 13) {
				System.out.print("Classifica��o: juvenil A");
			}
			else if(idade >= 14 && idade <= 17) {
				System.out.print("Classifica��o: juvenil B");
			}
			else if(idade >= 18) {
				System.out.print("Classifica��o: adultos");
			}
		else {
			System.out.print("Voc� n�o se enquadra em nenhuma das categorias");
		}
	}

}
