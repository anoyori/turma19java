programa
{
	
	funcao inicio()
	{
/*	1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.	 */

	real soma = 0
	real media
	real valor = 0
	inteiro contador = 0

		enquanto(valor >= 0)
		{
		soma = soma + valor
		escreva("Digite um valor: ")
		leia(valor)
		contador++
		}

		contador--
		linha()
		escreva("Soma foi valor: ", soma, "\n")
		media = soma/contador
		escreva("A média é: ",media,"\n")
		escreva("Quantidade de numeros lidos: ",contador,"\n")
		linha()
		escreva("Fim do Programa")
	}
	funcao linha()
		{
			escreva("----------------------------------------\n")
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */