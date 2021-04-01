package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ExemploCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago. 
		 */
		int minutos, excesso, conta = 50, valorTotal;
				
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a quantidade de minutos consumida: ");
		minutos = leia.nextInt();
		
		if(minutos > 100) {
			conta += (minutos - 100) *2;
			System.out.printf("Valor a pagar: R$ %d", conta);
		}
		else {
			System.out.print("Valor a pagar: R$ 50.00");
		}
	}
}
