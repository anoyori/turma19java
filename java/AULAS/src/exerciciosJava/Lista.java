package exerciciosJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size()); //tamanho da lista
		
		for(String obj: list) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------------------");
		//list.remove(1); //Remove pelo índice ou pelo nome
		list.removeIf(obj -> obj.charAt(0) == 'M'); //Predicado - remove os itens que começam com letra M
		
		for(String obj: list) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //encontra a posição na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //-1 quando não tem na lista
		System.out.println("------------------------------------------");
		
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList()); //filtra os nomes
		for(String obj: result) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------------");
		String name = list.stream().filter(obj -> obj.charAt(0) == 'A').findFirst().orElse(null); //encontra o primeiro elemento com letra A, se não retorna com NULL
		System.out.println(name);
	}

}
