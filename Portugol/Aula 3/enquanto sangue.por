programa
{
	
	funcao inicio()
	{
		inteiro tipo
		escreva("Digite o tipo: 1-A, 2-AB, 3-B, 4-O: ")
		leia(tipo)
		enquanto (tipo <= 0 ou tipo > 4)
		{
			escreva("Você não selecionou o tipo, tente de novo.")
			leia(tipo)
			
		}
		escreva("Programa finalizado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */