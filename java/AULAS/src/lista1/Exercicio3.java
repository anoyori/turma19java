package lista1;

	import java.util.Scanner;

	public class Exercicio3 {
		
		public static void main(String[] args) {
	/*Exerc�cio 3 - Fa�a um sistema que leia o tempo de dura��o de um  evento em uma f�brica expressa em
	segundos e mostre-o expresso em horas, minutos e segundos.
	*/
			
			Scanner leia = new Scanner(System.in);
			
			int tempoSegundos, horas, minutos, segundos;
			
			System.out.print("Qual a dura��o do evento em segundos? ");
			tempoSegundos = leia.nextInt();
			
			horas = tempoSegundos/(3600);
			minutos = tempoSegundos%(3600)/60;
			segundos = tempoSegundos%(3600)%60;
			
			System.out.println("O tempo do seu evento � "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
			
		}

}
