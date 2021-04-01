package exerciciosJava;

import java.util.Scanner;

public class Exercicio3Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 * 
 */
		Scanner leia = new Scanner(System.in);
		
		int tipo, gasolina = 0, diesel = 0, alcool = 0;
		
		System.out.print("Selecione uma opção: \n1 - Álcool \n2 - Gasolina \n3 - Diesel \n4 - Fim \nOpção: ");
		tipo = leia.nextInt();
		
		while(tipo != 4) {
			System.out.print("Selecione uma opção: \n1 - Álcool \n2 - Gasolina \n3 - Diesel \n4 - Fim \nOpção: ");
			tipo = leia.nextInt();
			if(tipo == 1) {
				alcool = alcool +1;
			}
			else if(tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if(tipo == 3) {
				diesel = diesel + 1;
			}
		}
		System.out.print("Muito Obrigada\n");
		System.out.println("Álcool teve " + alcool + " clientes");
		System.out.println("Diesel teve " + diesel + " clientes");
		System.out.println("Gasolina teve " + gasolina + " gasolina");
	}

}
