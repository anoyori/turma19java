
	/*
		inteiro numero

		escreva("Digite o número do mês [1-3]")
		leia(numero)

		se(numero == 1)
		{
			escreva("Janeiro")
		}

		senao se (numero ==2)
		{
			escreva("Fevereiro")
		}
		senao se (numero == 3)
		{
			escreva("Março")
		}
		senao{
			escreva("Você não escolheu nenhuma das opções")
		}
	}
	
*/
programa
{
	
	funcao inicio()
	{

		inteiro numero

		escreva("Digite o número do mês [1-3]")
		leia(numero)
		escolha(numero)
		{
			caso 1: 
				escreva("Janeiro")
			pare

			caso 2:
				escreva("Fevereiro")
			pare

			caso 3:
				escreva("Março")
			pare

			caso contrario:
				escreva("Você não escolheu nenhuma opção")
			pare
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */