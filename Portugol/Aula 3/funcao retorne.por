programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome
		real temperaturaC
		real temperaturaF

		escreva("Qual seu nome? ")
		leia(nome)
		
		escreva("Qual a sua temperatura em Celsius? ")
		leia(temperaturaC)
		escreva("Oi ", nome, ", a temperatura em Fahrenheit é ", (temperaturaC*1.8+32))
		

	}
	funcao real temperaturaF (real temperaturaC) 
	{
		real temperaturaF

		temperaturaF = (temperaturaC*1.8+32)
		retorne temperaturaC
	}	

		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */