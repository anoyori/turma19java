programa
{
	
	funcao inicio()
	{
/*Exercício 2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/

	inteiro dado = 0
	inteiro lancamentos [10]
	real media = 0.00
	inteiro soma = 0
	inteiro contador =0
	inteiro maiorNumero = 0


	para(inteiro x=0; x<10; x++){
		escreva("Digite o valor do dado ", x+1, ": ")
		leia(lancamentos[x])
		media = media + lancamentos[x]
		
		se(maiorNumero < lancamentos[x]){
			maiorNumero = lancamentos[x]
			contador = 1
		}
		senao se(maiorNumero == lancamentos[x]){
			contador++
		}
		
	
	}
	media = media/10
	escreva("\nMédia: ", media)	
	escreva("\nMaior número: ", maiorNumero, " apareceu ", contador, " vezes.\n")
	escreva("\nFim do programa")
	escreva("\n------------------------------------------")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 929; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */