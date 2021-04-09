package EXEMPLO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> nomes = new ArrayList();
		
		nomes.add("Mario");
		nomes.add("Luigi");
		nomes.add("Yoshi");
		nomes.add("Bowser");
		
		for(String name: nomes) {
			System.out.println("Lista de nomes: "+ name);
		}
		
		
		/*Collection<String> nomes2 = Arrays.asList("Peach","Toad");
		nomes.addAll(nomes2);
		System.out.print("Lista de nomes: "+ nomes);*/
		
		//System.out.println("Contém Yoshi? "+ nomes.contains("Yoshi")); // indica que tem 
		//nomes.clear();//limpa a lista
		//nomes.remove("Bowser"); //remover um item

		
		/*if(nomes.isEmpty()) {
			System.out.print("Lista Vazia");
		}
		else {
			System.out.print("Lista de nomes: "+ nomes);
		}*/
		
	}

}
