package lista6LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
/*Escrever um programa que receba vários números
 *inteiros no teclado. E no final imprimir a média
 *dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		double soma=0, media, contador = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if(numero%3 == 0 && numero!=0) {
			soma = soma + numero;
			contador++;
			}
		}
		while(numero != 0);
		media = soma / contador;
		System.out.print("Contador = "+ contador);
		System.out.printf("Média: %.2f", media);
	}
}
