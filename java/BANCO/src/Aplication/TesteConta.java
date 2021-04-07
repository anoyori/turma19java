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
		System.out.print("Selecione a operação: \n1 - Crédito \n2 - Débito");
		char opcao = leia.next().charAt(0);
		
		if(opcao == '1') {
			contaJoao.credito(valor);
		}
		else if(opcao =='2') {
			contaJoao.debito(valor);
		}
		
		System.out.printf("CPF: %s \n",contaJoao.getCpF());
		System.out.printf("Número da conta: %d\n", contaJoao.getNumero());
		System.out.printf("Saldo: %.2f \n", contaJoao.getSaldo());
		

	}

}
