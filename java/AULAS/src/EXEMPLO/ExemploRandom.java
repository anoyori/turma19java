package EXEMPLO;

import java.util.Scanner;
public class ExemploRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner tc = new Scanner(System.in);

		 int valores[] = new int[6];

		 System.out.println("Sorteando valores:");
		 for (int x=0; x<6; x++) {

		 valores[x] = (int) ((Math.random()*6)+1);
		 System.out.printf("%dº valor : %d\n",x+1,valores[x]);
		 
		 }
		       		
	}

}
