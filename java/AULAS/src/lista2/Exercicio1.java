package lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
/*Exercício 1 - João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
*/
		int pesoTomate;
	    int excesso;
		int valorMulta = 4;
		int calculoMulta = 4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual o peso dos tomates?");
		pesoTomate = leia.nextInt();
		
		if(pesoTomate < 50) {
			System.out.println("Você não excedeu, portanto não pagará multa.");
		}
		
		else if(pesoTomate >= 50) {
			excesso = pesoTomate - 50;
			calculoMulta = excesso * valorMulta;
			System.out.printf("Você excedeu o peso do tomate em %d kg. Sua multa será R$ %d %n", excesso ,calculoMulta);
					
		}			
		
	}

}
