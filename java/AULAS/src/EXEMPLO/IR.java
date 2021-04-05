package EXEMPLO;

import java.util.Scanner;

public class IR {

	public static void main(String[] args) {
		/*1500 ISENTO/ISENTE/ISENTA
		1500 ATÉ 2500 PAGA 15%
		ACIMA DE 2500 PAGA 25%
		*/
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double salarioBruto, salarioLiquido, imposto;
		char tratamento;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Como você deseja ser tratado? 1 - Sr; 2 - Sra; 3 - Sre:");
		tratamento = leia.next().charAt(0);
		System.out.print("Digite o seu salário bruto: ");
		salarioBruto = leia.nextDouble();
		
		if(tratamento == '1') {
			if(salarioBruto <= 1500) {
				System.out.print("Sr. " + nome + "você é isento.");
			}
			else if(salarioBruto > 1500 && salarioBruto <= 2500) {
				imposto = salarioBruto * 0.15;
				salarioLiquido = salarioBruto - imposto;
				System.out.print("Sr. "+nome+" vc vai pagar 15% de IR R$ "+imposto+" seu salário liquido "+salarioLiquido);
			}
			else if(salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.print("Sr. "+nome+" vc vai pagar 25% de IR R$ "+imposto+" seu salário liquido "+salarioLiquido);
			}
		}
		else if(tratamento == '2') {
			if(salarioBruto <= 1500) {
				System.out.print("Sra. " + nome + "você é isenta.");
			}
			else if(salarioBruto > 1500 && salarioBruto <= 2500) {
				imposto = salarioBruto * 0.15;
				salarioLiquido = salarioBruto - imposto;
				System.out.print("Sra. " + nome +" vc vai pagar 15% de IR R$ "+imposto+" seu salário liquido "+salarioLiquido);		
			}
			else if(salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.print("Sra. "+nome+" vc vai pagar 25% de IR R$ "+imposto+" seu salário liquido "+salarioLiquido);
			}
		}
		else if(tratamento == '3') {
			if(salarioBruto <= 1500) {
				System.out.print("Sre. " + nome + "você é isente.");
			}
			else if(salarioBruto > 1500 && salarioBruto <= 2500) {
				imposto = salarioBruto * 0.15;
				salarioLiquido = salarioBruto - imposto;
				System.out.print("Sre. " + nome +" vc vai pagar 15% de IR R$ "+imposto+" seu salario liquido "+salarioLiquido);		
			}
			else if(salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.print("Sre. "+nome+" vc vai pagar 25% de IR R$ "+imposto+" seu salário liquido "+salarioLiquido);
			}
		}
		
		
		
	}

}
