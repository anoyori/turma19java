programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	//Exercício 4
	{
	real A, B, C, R, S, D

	escreva("Qual o valor de A? ")
	leia(A)

	escreva("Qual o valor de B? ")
	leia(B)

	escreva("Qual o valor de C? ")
	leia(C)

	R = Matematica.potencia((A + B),2.0)
	escreva("R = ",R, "\n")

	S = Matematica.potencia((B + C), 2.0)
	escreva("S = ", S, "\n")

	D = (R + S)/2
	escreva("D = ", D)
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */