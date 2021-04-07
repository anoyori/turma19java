package lista7OrientacaoObjeto;

import java.util.Scanner;

public class ClienteAplicaco {

	public static void main(String[] args) {
				// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
				
		ClienteClasse cliente1 = new ClienteClasse();
		ClienteClasse cliente2 = new ClienteClasse();
				
		System.out.print("Digite o nome do cliente 1: ");
		cliente1.nome = leia.next();
		System.out.print("Digite o ano de nascimento do cliente 1: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.print("Qual seu cpf? ");
		cliente1.cpf = leia.next();
				
		System.out.print("Digite o nome do cliente 2: ");
		cliente2.nome = leia.next();
		System.out.print("Digite o ano de nascimento do cliente 2: ");
		cliente2.anoNascimento = leia.nextInt();
		System.out.print("Qual seu cpf? ");
		cliente2.cpf = leia.next();
		
		System.out.printf("Cliente 1 se chama %s tem %d anos e CPF: %s",cliente1.nome,cliente1.calculaIdade(2021), cliente1.cpf);
		System.out.printf("\nCliente 2 se chama %s tem %d anos e CPF: %s",cliente2.nome,cliente2.calculaIdade(2021), cliente2.cpf);

	}

}
