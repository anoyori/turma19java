package exerciciosJava;

import java.util.Scanner;

public class Exercicio4For {

	public static void main(String[] args) {
/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros
e mostre a divis�o do primeiro pelo segundo. Se o denominador for igual 
a zero, mostrar a mensagem "divisao impossivel".
*/
		Scanner leia = new Scanner(System.in);
		
		double x, y, resultado;
		int n;
		
		System.out.print("Digite a quantidade de divis�es: ");
		n = leia.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Digite um valor: ");
			x = leia.nextDouble();
			System.out.print("Digite o denominador: ");
			y = leia.nextDouble();
			
			if(y == 0) {
				System.out.print("Divis�o imposs�vel\n");	
				System.out.print("-----------------------------------------\n");
			}
			else {
			resultado = x/y;
			System.out.print(x + " : " + y +" = " + resultado + "\n");
			System.out.print("-----------------------------------------\n");
			}
		}
	}

}
