package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Exercício 2 - Elabore um sistema que leia as variáveis C e N, respectivamente código e 
		número de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha 
		R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		excedente. 
		 */
		
		Scanner leia = new Scanner(System.in);
		double C, N, horaExtra, salarioTotal;
		//C=código, N = número de horas trabalhadas
		
		System.out.print("Quantas horas você trabalhou? ");
		N = leia.nextDouble();
		
		if(N>50) {
			horaExtra = N - 50;
			
			salarioTotal = ((N-horaExtra)*10) + (horaExtra*20);
			System.out.print("Você excedeu o total de " + horaExtra + " horas.");
			System.out.print("\nSeu salário será de: R$ " + salarioTotal);
			
		}
		
	}

}
