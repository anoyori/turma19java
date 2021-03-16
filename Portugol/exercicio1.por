programa
{
	
	funcao inicio()
	{
		// Exercício 1 -Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

	inteiro idadeAnos
	inteiro idadeMeses
	inteiro idadeDias
	inteiro totalDias

	escreva("Qual sua idade? ")
	leia(idadeAnos)
	
	escreva("Quantos meses? ")
	leia(idadeMeses)

	escreva("Quantos dias?")
	leia(idadeDias)

	totalDias = (idadeAnos*365)+(idadeMeses*30)+idadeDias

	escreva("Sua idade em dias é ", totalDias, ".")
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */