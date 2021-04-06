package EXEMPLO;

import java.util.Scanner;

public class ExercicioVetorNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String nome[] = new String [4];
		int nota[] = new int[4];
		
		for(int x=0; x<4; x++) {
			System.out.print("Digite o nome: ");
			nome[x] = leia.next();
			System.out.print("Digite a nota: ");
			nota[x] = leia.nextInt();
			
			if(nota[x] >= 1 && nota[x] <= 5) {
				System.out.print(nome[x]+ " nota: "+nota[x]+ ". Ainda não\r");
			}
			else if(nota[x] > 5 && nota[x]<=10) {
				System.out.print(nome[x]+ " nota: "+nota[x]+ ". Muito bem!\r");
			}
			else {
				System.out.print("Insira uma nota entre 1 e 10\n");
			}
			System.out.println("");
		}
	}

}
