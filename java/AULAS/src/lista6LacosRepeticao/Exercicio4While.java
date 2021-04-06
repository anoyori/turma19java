package lista6LacosRepeticao;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
*número de pessoas calmas;
*número de mulheres nervosas;
*número de homens agressivos;
*número de outros calmos;
*número de pessoas nervosas com mais de 40 anos;
*número de pessoas calmas com menos de 18 anos. 
 */

		Scanner leia = new Scanner(System.in);
		
		int idade; //1-feminino / 2-masculino / 3-Outros
		int contador = 0;
		char sexo, opcoes;  //1, se a pessoa era calma; 
		//2, se a pessoa era nervosa
		//3, se a pessoa era agressiva
		final int INDIVIDUOS = 6;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40 = 0;
		int pessoasCalmasMenos18 = 0;
				
		char continua = 'S';
		
		while(continua == 'S' && contador < INDIVIDUOS) {
			System.out.print("Informe a sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros");
			sexo = leia.next().charAt(0);
			System.out.print("Digite: \n1 - se a pessoa era calma; \n2 - se a pessoa nervosa;\n3 - se a pessoa era agressiva");
			opcoes = leia.next().charAt(0);
			
			if(contador != INDIVIDUOS) {
			System.out.print("\nVocê deseja fazer a pesquisa S-sim / N-Não");
			continua = leia.next().toUpperCase().charAt(0);
			}
			if(opcoes == '1') {
				pessoasCalmas++;
			}
			if(sexo == '1' && opcoes == '2') {
				mulheresNervosas++;
			}
			if(sexo == '2' && opcoes == '3'){
				homensAgressivos++;
			}
			if(sexo == '3' && opcoes == '1'){
				outrosCalmos++;
			}
			if(opcoes == '2' && idade > 40) {
				pessoasNervosasMais40++;
			}
			if(opcoes == '1' && idade < 18) {
				pessoasCalmasMenos18++;
			}
			contador++;
		}
		System.out.println("Pessoas Calmas: "+pessoasCalmas);
		System.out.println("Mulheres Nervosas: "+mulheresNervosas);
		System.out.println("Homens Agressivos: "+homensAgressivos);
		System.out.println("Outros Calmos: "+outrosCalmos);
		System.out.println("Pessoas Nervosas com Mais de 40 anos: "+pessoasNervosasMais40);
		System.out.println("Pessoas Calmas com Menos de 18 anos: "+pessoasCalmasMenos18);

	}

}
