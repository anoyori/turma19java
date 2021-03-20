programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	/*Exercicio 6 - Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
	 */

	 real x1, x2, y1, y2, d, potenciaX,potenciaY

	 escreva("Qual o valor de x1? ")
	 leia(x1)

	 escreva("Qual o valor de x2? ")
	 leia(x2)

	 escreva("Qual o valor de y1? ")
	 leia(y1)

	 escreva("Qual o valor de y2? ")
	 leia(y2)

	 potenciaX = (Matematica.potencia((x2-x1), 2.0))
	 potenciaY = (Matematica.potencia((y2-y1), 2.0))

	escreva("D = ", (Matematica.raiz((potenciaX + potenciaY), 2.0)))
	 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */