package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Exerc�cio 2 - Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e 
		n�mero de horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha 
		R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
		excedente. 
		 */
		
		Scanner leia = new Scanner(System.in);
		double C, N, horaExtra, salarioTotal;
		//C=c�digo, N = n�mero de horas trabalhadas
		
		System.out.print("Quantas horas voc� trabalhou? ");
		N = leia.nextDouble();
		
		if(N>50) {
			horaExtra = N - 50;
			
			salarioTotal = ((N-horaExtra)*10) + (horaExtra*20);
			System.out.print("Voc� excedeu o total de " + horaExtra + " horas.");
			System.out.print("\nSeu sal�rio ser� de: R$ " + salarioTotal);
			
		}
		
	}

}
