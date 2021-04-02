package lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
/*Exercício 4 - Crie um programa que receba valores do usuário para preencher uma
matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da 
primeira diagonal, ou seja, diagonal principal. 
*/
		Scanner leia = new Scanner(System.in);
		
		int matriz [][]= new int [3][3];
		int totalDiagonal = 0;
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.print("Digite o valor da linha " + l + " coluna " + c + ": ");
				matriz[l][c] = leia.nextInt();
				if(l == c) {
					totalDiagonal = totalDiagonal + matriz[l][c];
				}
			}
		}
		System.out.println("");
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\nTotal da diagonal: " + totalDiagonal);
	}
}
