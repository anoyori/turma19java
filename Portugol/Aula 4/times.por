programa
{
	
	funcao inicio()
	{
		//times de futebol
		//Palmeiras, Santos, SPFC, Corinthians

		cadeia times[4] //0,1,2,3
		inteiro indice = 0
		inteiro pontos [4]

		// g = ganhou = 3 ponto, e = empatou = 1 ponto, p = perdeu = 0
		// o [nome do time], g/p/e
		//conforme a letra vc coloca dentro do vetor na posição do time 3,1,0
		// saida = time + pontos 
		

		times[0] = "Palmeiras"
		times[1] = "Santos"
		times[2] = "SPFC"
		times[3] = "Corinthians"

		para(inteiro x=0; x<4; x++)
		escreva("O time ",x+1," é o ", times[x],"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */