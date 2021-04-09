package EXEMPLO;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import Classes.Aluno;

public class MapaAluno {

	public static void main(String[] args) {

		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("João","ADM",4.6);
		Aluno b = new Aluno("Amanda","ADS",8.9);
		Aluno c = new Aluno("Mario","COMEX",6.0);
		
		mapa.put("João",a);
		mapa.put("Amanda",b);
		mapa.put("Mario",c);	
		
		System.out.println(mapa);
		System.out.println(mapa.get("Mario"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e: alunos) {
			System.out.println(e);
		}

	}

}
