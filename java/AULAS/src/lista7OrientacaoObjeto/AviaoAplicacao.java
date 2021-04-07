package lista7OrientacaoObjeto;

import java.util.Scanner;

public class AviaoAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		AviaoClasse pass1 = new AviaoClasse();
		AviaoClasse pass2 = new AviaoClasse();
		
		
		System.out.print("Qual seu primeiro nome? ");
		pass1.primeiroNome = leia.next();		
		System.out.print("Qual seu último nome? ");
		pass1.sobrenome = leia.next();		
		System.out.println("Qual seu destino? ");
		pass1.destino = leia.next();
		
		System.out.print("Qual seu primeiro nome? ");
		pass2.primeiroNome = leia.next();
		System.out.print("Qual seu último nome? ");
		pass2.sobrenome = leia.next();
		System.out.print("Qual seu destino? ");
		pass2.destino = leia.next();
		
		System.out.printf("%s viajará para %s", pass1.nomeCompleto(), pass1.destino);
		System.out.printf("\n%s viajará para %s", pass2.nomeCompleto(), pass2.destino);
	}

}
