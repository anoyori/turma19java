package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.Revista;
import entities.Roupas;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Produto prod1 = new Produto("CAMISA", "XL001",100.25);
		Revista prod2 = new Revista("CRAUDIA","RR0023",25.20,"ABRIL");
		Roupas prod3 = new Roupas("CALÇA", "XL001",90.50,"ZARA");
		
		prod2.incluirEstoque(10);
		prod3.incluirEstoque(1000);
		
	
		System.out.print(prod1.getDescricao() + " R$ "+prod1.getValorUnitario());
		System.out.print("\nEstoque: " + prod1.getQtdeEstoque());
		prod1.setValorUnitario(80.55);
		prod1.incluirEstoque(20);
		
		System.out.print("Estoque: " + prod1.getQtdeEstoque());
		System.out.print("\n"+prod1.getDescricao() + " R$ "+prod1.getValorUnitario());
		prod1.tirarEstoque(10);
		
		System.out.print("\nCusto total: R$ "+(10*prod1.getValorUnitario()));
		System.out.print("\nEstoque: " + prod1.getQtdeEstoque());
		
		System.out.println(prod2.getDescricao()+ " " + prod2.getQtdeEstoque());
		System.out.print(prod3.getDescricao()+ " "+prod3.getValorUnitario());
	}

} //fim da classe
