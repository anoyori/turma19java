programa
{
	
	funcao inicio()
	{
		cadeia agenda[24][31] //linha x coluna
		inteiro dia
		inteiro hora
		caracter opcao

		faca{

			escreva("Digite o dia do compromisso: ")
			leia(dia)
			dia -= 1
			escreva("Digite a hora: ")
			leia(hora)
			escreva("Informe o compromisso: ")
			leia(agenda [hora][dia])
			escreva("Continua? S-sim / N -nao: ")
			leia(opcao)
			
			se(opcao == 'n' ou opcao == 'N'){
				pare
			}

		}enquanto (verdadeiro)
		escreva("Agenda \n")
		
		para(inteiro d=0; d<31; d++){
			para(inteiro h=0; h<24; h++){
			escreva("Agenda dia ",d+1, " às ", h, " ",agenda[d][h],"\n")
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */