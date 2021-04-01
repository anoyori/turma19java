package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.  
*/
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int contador = 0;
		double salario = 0, filhos, mediaSalario, mediaFilhos, maiorSalario = 0;
		double totalSalario = 0, totalFilhos = 0, percentualPessoas;
		final double X = 20;
		
		for(int i = 1; i<= X ; i++) {
			System.out.print("Habitante " + i + "\n");
			System.out.print("Qual o seu sal�rio? R$ ");
			salario = leia.nextDouble();
			totalSalario = totalSalario + salario;
			System.out.print("Quantos filhos voc� tem? ");
			filhos = leia.nextDouble();
			totalFilhos = totalFilhos + 1;	
			System.out.println("");
			
			if(maiorSalario < salario) {
				maiorSalario = salario;
			}
			if(salario <= 100) {
				contador++;
			}
		}	
		
		mediaSalario = totalSalario/X;
		System.out.printf("%nM�dia salarial: R$ %.2f", mediaSalario);
		mediaFilhos = totalFilhos/X;
		System.out.printf("\nM�dia de filhos: %.1f", mediaFilhos);
		System.out.print("\nMaior sal�rio: R$ " + maiorSalario);
		percentualPessoas = (contador / X) * 100;
		System.out.print("\nPercentual de pessoas que ganham at� R$ 100: " + percentualPessoas + " %");
	}
}
