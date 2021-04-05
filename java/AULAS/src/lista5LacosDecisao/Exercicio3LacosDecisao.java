package lista5LacosDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3LacosDecisao {

	public static void main(String[] args) {
/*Exercício3 - Faça um programa que receba a idade de uma pessoa
e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int idade;
		
		System.out.print("Qual sua idade? ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.print("Categoria Infatil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.print("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.print("Categoria Adulto");
		}
		else {
			System.out.print("Idade fora das categorias");
		}
	}

}
