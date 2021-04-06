package EXEMPLO;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes [] = new String[3];
		String apostolos[] = {"LUCAS", "MATEUS", "JUDAS"}; // apostolos[0], apostolos[1], apostolos[2]
		String nome1, nome2, nome3;
		
		nome1 = "JOAO";
		nomes[0] = "PAULO";
		nome2 = "MARIA";
		nomes[1] = "MADALENA";
		nome3 = "PEDRO";
		nomes[2] = "RITA";
		
		for(int x=0; x<apostolos.length; x++) {
			System.out.println(apostolos[x]);
		}
	
		
	}

}
