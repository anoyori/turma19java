package exerciciosJava;

import java.util.Scanner;

public class Exercicio3Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
exemplo.
 * 
 */
		Scanner leia = new Scanner(System.in);
		
		int tipo, gasolina = 0, diesel = 0, alcool = 0;
		
		System.out.print("Selecione uma op��o: \n1 - �lcool \n2 - Gasolina \n3 - Diesel \n4 - Fim \nOp��o: ");
		tipo = leia.nextInt();
		
		while(tipo != 4) {
			System.out.print("Selecione uma op��o: \n1 - �lcool \n2 - Gasolina \n3 - Diesel \n4 - Fim \nOp��o: ");
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
		System.out.println("�lcool teve " + alcool + " clientes");
		System.out.println("Diesel teve " + diesel + " clientes");
		System.out.println("Gasolina teve " + gasolina + " gasolina");
	}

}
