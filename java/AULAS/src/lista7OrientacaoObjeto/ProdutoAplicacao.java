package lista7OrientacaoObjeto;

import java.util.Scanner;

public class ProdutoAplicacao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ProdutoClasse produto1 = new ProdutoClasse();
		ProdutoClasse produto2 = new ProdutoClasse();
		
		System.out.print("Escolha o produto: ");
		produto1.nomeDoProduto = leia.next();
		System.out.print("Escolha a marca: ");
		produto1.marca = leia.next();
		System.out.print("Qual o preço? R$");
		produto1.preco = leia.nextDouble();
		
		System.out.print("Escolha o produto: ");
		produto2.nomeDoProduto = leia.next();
		System.out.print("Escolha a marca: ");
		produto2.marca = leia.next();
		System.out.print("Qual o preço? R$");
		produto2.preco = leia.nextDouble();
		
		System.out.printf("O produto %s da marca %s custa R$ %.2f", produto1.nomeDoProduto, produto1.marca, produto1.preco);
		System.out.printf("\nO produto %s da marca %s custa R$ %.2f", produto2.nomeDoProduto, produto2.marca, produto2.preco);
		
	}

}
