package Application;

import java.util.Scanner;
import Entity.Animal;
import Entity.Cachorro;
import Entity.Cavalo;
import Entity.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Animal bicho1 = new Animal();
		Cachorro bicho2 = new Cachorro("Nara",1,"Auau");
		Cavalo bicho3 = new Cavalo("Joe",11,"Hin in in in");
		Preguica bicho4 = new Preguica("Aretha", 0, "A mimir ....");

		System.out.print("Cachorro(a) " + bicho2.nome + " tem " + bicho2.idade + " ano(s).\n");
		System.out.println(bicho2.Movimento() +". "+ bicho2.som());
		
		System.out.print("\nCavalo/égua " + bicho3.nome + " tem " + bicho3.idade + " ano(s).\n");
		System.out.println(bicho3.Movimento()+". " + bicho3.som());
		
		System.out.print("\nPreguica " + bicho4.nome + " tem " + bicho4.idade + " ano(s).\n");
		System.out.println(bicho4.Movimento()+". " + bicho4.som());

	}

}
