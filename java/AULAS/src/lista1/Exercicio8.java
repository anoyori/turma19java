package lista1;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
/* Exerc�cio 8 - O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
 */
	
	Scanner leia = new Scanner(System.in);
	double custoConsumidor, custoFabrica, distribuidor, imposto;
	
	System.out.print("Qual o custo de f�brica do carro? R$ ");
	custoFabrica = leia.nextDouble();
	
	distribuidor = 0.28*custoFabrica;
	imposto = 0.45*custoFabrica;
	custoConsumidor = custoFabrica + distribuidor + imposto;
	
	System.out.print("O custo do carro ao consumidor � R$ "+custoConsumidor);
	
	}

}
