package exerciciosJava;

import java.util.Scanner;

public class Exercicio4Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule
 *a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia e
 *terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 */
		int horaInicial, horaFinal, horaTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a hora inicial: ");
		horaInicial = leia.nextInt();
		
		System.out.print("Digite a hora final: ");
		horaFinal = leia.nextInt();
		
		if(horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
		}
		else {
			horaTotal = (24 - horaInicial) + horaFinal;
		}
		System.out.printf("O jogo durou %d horas", horaTotal);
	}
}
