programa
{
	
	funcao inicio()
	{
	//Exercicio 7

	real a, b, c, d, x, f, g, y

	//Defina os valores de a, b, c, d, x, f

	escreva("Qual o valor de a? ")
	leia(a)

	escreva("Qual o valor de b? ")
	leia(b)

	escreva("Qual o valor de c? ")
	leia(c)

	escreva("Qual o valor de d? ")
	leia(d)

	escreva("Qual o valor de g? ")
	leia(g)

	escreva("Qual o valor de f? ")
	leia(f)

	//Calculando valores de X e Y

	x = (c*g - b*f)/(a*g - b*d)
	escreva("X = ", x)

	y = (a*f - c*d)/(a*g - b*d)
	escreva("\nY = ", y)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */