package EXEMPLO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int nota = 0;
		String nomes [] = new String[3];
		String situacao = "";
		
		try {		
		System.out.print("Digite a posição [0-2]: ");
		int aux = leia.nextInt();
		
		System.out.print("Digite o nome da pessoa: ");
		nomes[aux] = leia.next();
		
		System.out.println("Digite a nota: ");
		nota= leia.nextInt();
		
		if(nota <= 5) {
			situacao = "ainda não";
		}
		else {
			situacao = "passou";
		}
		System.out.printf("Aluno %s, sua situação: %s", nomes[aux], situacao);
		}
		
		catch(InputMismatchException erro) {
			System.out.print("Voce nao digitou um numero");
		}
		catch(ArrayIndexOutOfBoundsException erro) {
			System.out.print("Você digitou um numero de vetor que não existe");
		}
				System.out.print("\nFim");
		
		

	}

}
