package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int codigo, quantidade;
		double preco = 0;
		
		System.out.print("Escolha um dos itens: \n1 - Cachorro quente\n2 - X-salada\n3 - X-bacon\n4 - Torrada simples\n5 - Refrigerante\nDigite o código do item: ");
		codigo = leia.nextInt();
		
		System.out.print("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		if(codigo == 1) {
			preco = quantidade * 4.0;
		}
		else if(codigo == 2) {
			preco = quantidade * 4.5;
		}
		else if(codigo == 3) {
			preco = quantidade * 5.0;
		}
		else if(codigo == 4) {
			preco = quantidade * 2.0;
		}
		else if(codigo == 5) {
			preco = quantidade * 1.50;
		}
		System.out.printf("O valor total é R$ %.2f", preco);
		
	}

}
