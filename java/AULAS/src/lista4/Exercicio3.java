package lista4;

public class Exercicio3 {

	public static void main(String[] args) {
		
/*Exercício 3 - Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição
das matrizes N1 e N2.
*/	
		int n1 [][] = new int [4][6];
		int n2 [][] = new int [4][6];
		int soma [][] = new int [4][6];
		int sub [][] = new int [4][6];		
		int numero = 0;
				
		for(int  l=0; l<4; l++) {
			for( int c=0; c<6; c++) {
				n1[l][c] = (int) ((Math.random()*9)+1);
				n2[l][c] = (int) ((Math.random()*9)+1);
				soma[l][c] = n1[l][c] + n2[l][c];
				sub[l][c] = n1[l][c] - n2[l][c];
			}
		}
		System.out.print("N1\n");
		for(int  l=0; l<4; l++) {
			for( int c=0; c<6; c++) {
				System.out.print(n1[l][c]+ " ");
			}
			System.out.print("\n");		
		}
		System.out.print("\nN2\n");
		for(int  l=0; l<4; l++) {
			for( int c=0; c<6; c++) {
				System.out.print(n2[l][c]+ " ");
			}
			System.out.print("\n");
		}
		System.out.print("\nM1\n");
		for(int  l=0; l<4; l++) {
			for( int c=0; c<6; c++) {
				System.out.print(soma[l][c]+ " ");
			}
			System.out.print("\n");
		}
		System.out.print("\nM2\n");
		for(int  l=0; l<4; l++) {
			for( int c=0; c<6; c++) {
				System.out.print(sub[l][c]+ " ");
			}
			System.out.print("\n");
		}
		
	}

}
