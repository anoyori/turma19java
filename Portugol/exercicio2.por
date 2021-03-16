programa
{
	
	funcao inicio()
	{
		/* Exercício 2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
		 *  e mostre-a expressa em anos, meses e dias.
		 */
	
	inteiro idadeAnos
	inteiro idadeMeses
	inteiro idadeDias
	inteiro totalDias

	escreva("Qual sua idade em dias? ")
	leia(idadeDias)

	idadeAnos = idadeDias/365
	escreva(idadeAnos, " anos\n")

	idadeMeses = idadeDias%365/30
	escreva(idadeMeses, " meses\n")

	idadeDias = idadeDias%365%30
	escreva(idadeDias, " dias\n")

	escreva("Você tem ",idadeAnos, " anos, ",idadeMeses, " meses, ",idadeDias, " dias.")

	
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */