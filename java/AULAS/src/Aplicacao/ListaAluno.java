package Aplicacao;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import Classes.Aluno;

public class ListaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Set<Aluno> conjunto = new HashSet<Aluno>();
		
		Aluno a = new Aluno("João","ADM",4.6);
		Aluno b = new Aluno("Amanda","ADS",8.9);
		Aluno c = new Aluno("Mario","COMEX",6.0);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.print(conjunto);
	}

}
