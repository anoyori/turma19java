package lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
/*Exerc�cio 1 - Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
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
			System.out.println("Voc� n�o excedeu, portanto n�o pagar� multa.");
		}
		
		else if(pesoTomate >= 50) {
			excesso = pesoTomate - 50;
			calculoMulta = excesso * valorMulta;
			System.out.printf("Voc� excedeu o peso do tomate em %d kg. Sua multa ser� R$ %d %n", excesso ,calculoMulta);
					
		}			
		
	}

}
