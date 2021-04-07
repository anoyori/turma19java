package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entity.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Conta contaJoao = new Conta();
		
		System.out.print("Digite o numero da conta: ");
		contaJoao.numero = leia.nextInt();
		System.out.print("Digite o CPF: ");
		contaJoao.cpf = leia.next();
		System.out.print("Digite o valor: ");
		double valor = leia.nextDouble();
		System.out.print("Selecione a opera��o: \n1 - Cr�dito \n2 - D�bito");
		char opcao = leia.next().charAt(0);
		
		if(opcao == '1') {
			contaJoao.credito(valor);
		}
		else if(opcao =='2') {
			contaJoao.debito(valor);
		}
		
		System.out.printf("CPF: %s \n",contaJoao.getCpF());
		System.out.printf("N�mero da conta: %d\n", contaJoao.getNumero());
		System.out.printf("Saldo: %.2f \n", contaJoao.getSaldo());
		

	}

}
