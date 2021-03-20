programa
{
	
	funcao inicio()

/* Exercício 7 - Receber valores de base e altura de um triângulo e verificar se são valores 
 válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */
	{
		real base = 0
		real altura = 0
		real area = 0

		escreva("Digite o valor da base: ")
		leia(base)

		escreva("Digite o valor da altura: ")
		leia(altura)

		se(base >= 0 e altura>=0){
			area = (base * altura) / 2
			escreva("A área do triângulo é igual a ", area, " cm2")
		}

		senao{
			escreva("Não é possível calcular área com valores negativos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */