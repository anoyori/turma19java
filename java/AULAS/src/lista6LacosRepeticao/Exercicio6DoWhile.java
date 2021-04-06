package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
/*Escrever um programa que receba v�rios n�meros
 *inteiros no teclado. E no final imprimir a m�dia
 *dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		double soma=0, media, contador = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			if(numero%3 == 0 && numero!=0) {
			soma = soma + numero;
			contador++;
			}
		}
		while(numero != 0);
		media = soma / contador;
		System.out.print("Contador = "+ contador);
		System.out.printf("M�dia: %.2f", media);
	}
}
