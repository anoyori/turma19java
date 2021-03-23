programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
/*Exercício 1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. * 
 */

	inteiro valor [5],x
	inteiro maiorValor = 0

	para(x=0; x<5; x++){
		escreva("Digite um valor: ")
		leia(valor[x])	

			se(maiorValor < valor [x]){
			maiorValor = valor [x]
		}
	}
		
	
	escreva("O maior valor é: ", maiorValor, "\n")
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */