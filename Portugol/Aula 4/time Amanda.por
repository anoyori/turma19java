programa
{
	
	funcao inicio()
	{
		cadeia times [4]
		inteiro ponto [4] 
		caracter resultado
		
		times[0] = "Palmeiras"
		times[1] = "Santos"
		times[2] = "SPFC"
		times[3] = "Corinthians"

		para(inteiro rodada=1; rodada<4;rodada++){
			escreva("Rodada ", rodada, "\n")

			para(inteiro y=0; y<4; y++)
			{
	
				escreva("O ",times[y]," g-ganhou, e-empatou, p-perdeu: ")
				leia(resultado)
		
				se(resultado == 'G' ou resultado == 'g'){
					ponto[y] = 3
				}
				senao se(resultado == 'E' ou resultado == 'e'){
					ponto[y] = 1
				}
				senao se(resultado == 'P' ou resultado == 'p'){
					ponto[y] = 0
				}
				
			}
		escreva("Resultados\n")
		para(inteiro x=0; x<4; x++){
			escreva(times[x], " pontos: ",ponto[x],"\n")
		//escreva("O time ", times[0]," tem ",ponto[0])
		}
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */