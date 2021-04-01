package exerciciosJava;

import java.util.Scanner;

public class Exercicio1Repeticao {
	
	public static void main(String[] args) {
/*EXERCICIO DE REPETICAO 1
Escreva um programa que repita a leitura de uma senha até
que ela seja válida. Para cada leitura de senha incorreta 
informada, escrever a mensagem "Senha Invalida". Quando a senha 
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
		Scanner leia = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite uma senha: ");
		senha = leia.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha Incorreta. Digite uma senha: ");
			senha = leia.nextInt();
		}
		System.out.print("Senha correta");
	}
}