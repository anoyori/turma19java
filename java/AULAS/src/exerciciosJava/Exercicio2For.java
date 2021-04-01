package exerciciosJava;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
/*2) Leia um valor inteiro N. Este valor será a quantidade de valores 
inteiros X que serão lidos em seguida. Mostre quantos destes valores X 
estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
mostrando essas informações conforme exemplo (use a palavra "in" para 
dentro do intervalo, e "out" para fora do intervalo).
 */
		Scanner leia = new Scanner(System.in);
		
		int n, in=0, out=0, x;
		
		System.out.print("Digite a quantidade de valores a serem lidos: ");
		n = leia.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Digite um valor: ");
			x = leia.nextInt();
			if(x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		System.out.print(in + " in\n");
		System.out.print(out + " out");
		}
}
