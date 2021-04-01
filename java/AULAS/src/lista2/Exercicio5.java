package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Exerc�cio 5 - A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que 
s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, 
se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes 
grupos de empresas. 
*/
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double indice;
		
		System.out.print("Qual o �ndice atual? ");
		indice = leia.nextDouble();
		
		if(indice < 0.4  && indice >= 0.3) {
			System.out.print("Grupo 1: suspendam as atividades");
		}
		else if(indice >= 0.4 && indice < 0.5) {
			System.out.print("Grupos 1 e 2: suspendam as atividades");
		}
		else if(indice >= 0.5) {
			System.out.print("Paraliza��o geral de todos os grupos");
		}
		else {
			System.out.print("�ndice dentro do aceit�vel, fique tranquilo");
		}
		
	}

}
