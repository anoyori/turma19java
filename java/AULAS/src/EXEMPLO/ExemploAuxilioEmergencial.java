package EXEMPLO;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAuxilioEmergencial {

	public static void main(String[] args) {

		Scanner leia = new  Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char simNao1;
		int filhos;
		int valorAuxilio;
		
		System.out.print("Você é beneficiario do bolsa família?\n (S)Sim (N)Não\n Resposta: ");
		simNao1 = leia.next().toUpperCase().charAt(0);
			
		if (simNao1 == 'N') {
			System.out.print("Você foi beneficiario do ultimo auxilio emergencial?\n (S)Sim (N)Não\nResposta: ");
			simNao1 = leia.next().toUpperCase().charAt(0);
			if (simNao1 == 'N') {
				System.out.print("Você não tem direito ao auxilio emergencial!");
			} 
			else if (simNao1 == 'S') {
				System.out.print("Você é chefa(e) de família?\n (S)Sim (N)Não\nResposta: ");
				simNao1 = leia.next().toUpperCase().charAt(0);
			}
			if (simNao1 == 'S') {
				System.out.print("Quantos filhos você tem? ");
				filhos = leia.nextInt();
				
				if(filhos != 0) {
					valorAuxilio = (50 * filhos) + 600;
					System.out.printf("Você receberá R$ %d", valorAuxilio);
				}
				else if(filhos == 0) {
					valorAuxilio = 600;
					System.out.printf("Você receberá R$ %d", valorAuxilio);
				}
				else {
					System.out.print("Você tem direito a R$300");
				}
			}

		} 
		else if (simNao1 == 'S') {
			System.out.print("Você não tem direito ao auxilio.");
		}
		System.out.println("\nFim do programa");
	}

}
