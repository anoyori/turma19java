package Aplicacao;

import java.util.Scanner;

import Classes.Pessoa;

public class CadFun {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Pessoa func1 = new Pessoa(); //instanciou uma pessoa
		Pessoa func2 = new Pessoa();
		int idade1, idade2;
		
		System.out.print("Digite o nome do funcionário 1: ");
		func1.nome = leia.next();
		
		System.out.print("Digite o nome do funcionário 2: ");
		func2.nome = leia.next();
		
		System.out.print("Digite o ano de nascimento do funcionário 1: ");
		func1.anoNascimento = leia.nextInt();
		
		System.out.print("Digite o ano de nascimento do funcionário 2: ");
		func2.anoNascimento = leia.nextInt();
		
		System.out.print("Selecione o gênero: \n1 - Feminino \n2 - Masculino \n3 - Outros");
		func1.genero = leia.next().charAt(0);
		
		System.out.print("Selecione o gênero: \n1 - Feminino \n2 - Masculino \n3 - Outros");
		func2.genero = leia.next().charAt(0);
		
		
		System.out.printf("Idade pessoa 1: %d", func1.calcularIdade());
		System.out.printf("\nIdade pessoa 2: %d", func2.calcularIdade());
		
		if(func1.calcularIdade() < func2.calcularIdade()) {
			System.out.printf("\n%s %s %s é a pessoa mais velha", func2.trazArtigo().toUpperCase(), func2.tratamento(), func2.nome);
		}
		else {
			System.out.printf("\n%s %s %s é a pessoa mais velha", func1.trazArtigo().toUpperCase(), func1.tratamento(), func1.nome);
		}


	}

}
