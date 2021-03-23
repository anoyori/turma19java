programa
{
	
	funcao inicio()
	{
		caracter opcao
		inteiro matricula
		cadeia cpf
		logico ativo
		real pontos

		faca{

			escreva("Colégio Santa Amanda\n")
	
			escreva("\n1 - BÁSICO\n")
			escreva("2 - MÉDIO\n")
			escreva("3 - GRADUAÇÃO\n")
			escreva("4 - PÓS\n")
			escreva("5 - MESTRADO\n")
			escreva("6 - SAIR\n")
			escreva("\nDigite a opção desejada: ")
			leia(opcao)
	
			se(opcao == '6'){
				escreva("Você escolheu a opção de saída\n")
			}
			senao se (opcao == '1'){
				
			}
			senao se (opcao == '2'){
				
			}
			senao se (opcao == '3'){
				
			}
			senao se (opcao == '4'){
				
			}
			senao se (opcao == '5'){
				
			}
		}enquanto(opcao != '6')
	escreva("Fim do programa")
		
	}

	funcao ensinoBasico ()

	
	limpa()
	escreva("CÓLEGIO SANTA AMANDA\n")
	escreva("\n \n")
	escreva("ENSINO BÁSICO\n")
	
	para(inteiro x=1; x<=10; x++){
		escreva("1 - incluir, 2 - ajustar, 3 - sair")
		leia(tipo)
		escreva("Informe o valor: ")
		leia(auxPontos)
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 738; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */