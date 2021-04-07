package Aplication;

import Entity.Conta;

public class TesteProgramador {

	public static void main(String[] args) {

		Conta exemploconta = new Conta(1,"123.123.123-12");
		
		exemploconta.credito(1000);
		exemploconta.debito(900);
		
		System.out.printf("CPF: %s \n",exemploconta.getCpF());
		System.out.printf("Número da conta: %d\n", exemploconta.getNumero());
		System.out.printf("Saldo: %.2f \n", exemploconta.getSaldo());
		

	}

}
