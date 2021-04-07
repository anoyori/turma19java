package EXEMPLO;

import java.util.Scanner;

public class ExemploCadastro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome1, nome2;
		int ano1, ano2, idade1, idade2;
		char opcao;
		String genero1, genero2;
		
		System.out.print("Digite o seu nome: ");
		nome1 = leia.next();
		System.out.print("Digite o ano de nascimento: ");
		ano1 = leia.nextInt();
		System.out.print("Gênero: \n1-Feminino \n2-Masculino \n3-Outros");
		opcao = leia.next().charAt(0);
		
		System.out.print("Digite o seu nome: ");
		nome2 = leia.next();		
		System.out.print("Digite o ano de nascimento: ");
		ano2 = leia.nextInt();		
		System.out.print("Gênero: \n1-Feminino \n2-Masculino \n3-Outros");
		opcao = leia.next().charAt(0);
		
		if(opcao == '1') {
			genero1 = "Feminino";
		}
		else if(opcao == '2') {
			genero1 = "Masculino";
		}
		else if(opcao == '3') {
			genero1 = "Outros";
		}
		idade1 = 2021 - ano1;
		idade2 = 2021 - ano2;
		
		System.out.printf("%s tem %d anos",nome1, idade1);
		System.out.printf("\n%s tem %d anos",nome2, idade2);
		
		if(idade1>idade2) {
			if(opcao == '1') {
			System.out.printf("A %s é mais velha que %s", nome1, nome2);
			}
		}

	}

}
