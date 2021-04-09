package Application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import Entity.Estoque;

public class ProgramaEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Collection<String> estoque = new ArrayList();
		List<Estoque> prod = new ArrayList();
		
		//Estoque prod1 = new Estoque("Camisa",3,79.99);
		//Estoque prod2 = new Estoque("Jaqueta",5,129.99);
		//Estoque prod3 = new Estoque("Calça",4,69.99);
		//Estoque prod4 = new Estoque("Sapato",1,60.99);
		
		//adiciona dados
		estoque.add("Camisa");
		estoque.add("Jaqueta");
		estoque.add("Calça");
		estoque.add("Sapato");
		
		//remove dados
		estoque.remove("Sapato");
		System.out.println(estoque);
		
		//imprimi itens - collection
		for(String produto: estoque) {
		System.out.println("Produto: "+produto);
		}
		
		//imprimi itens com dados - lista
		prod.add(new Estoque("Camisa",3,79.99));
		prod.add(new Estoque("Jaqueta",5,129.99));
		prod.add(new Estoque("Calça",4,69.99));
		prod.add(new Estoque("Sapato",1,60.99));
		
		for(Estoque product: prod) {
		System.out.printf("%s tem %d unidades e custa R$ %.2f\n",product.getTipo(),product.getQtde(),product.getValor());
		}
		
	}

}
