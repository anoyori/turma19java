package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Funcionario func1 = new Funcionario("1010","Antonio", 10, 20.00);
		Terceiro func2 = new Terceiro("1020", "Aretha", 200);
		
		func2.setHorasTrabalhadas(10);
		func2.setValorHora(20.00);
				

		System.out.printf("Sal�rio final do funcion�rio %s: %.2f", func1.getNome(), func1.salario());
		System.out.printf("\nSal�rio final do funcion�rio %s: %.2f", func2.getNome(), func2.salario());

	}

}
