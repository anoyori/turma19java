programa
{
	
	funcao inicio()
    {
        real indice

        escreva ("Digite o indice de poluição: ")
        leia (indice)

        se (indice>=0.3 e indice<0.4)
        {

            escreva ("Indices de poluentes esta em" ,indice, "\n1º grupo suspendam suas atividades")
        }
        senao se (indice>=0.4 e indice<0.5)
        {
            escreva ("Indices de poluentes esta em ",indice," \n 1º grupo e 2º grupo suspendam suas atividades")
        }
        senao se (indice>=0.5)
        {
            escreva ("Indices de poluentes esta em",indice," todos os grupos suspendam suas atividades")
        }
        senao 
        {
            escreva ("Indices de poluentes esta instavel siga com os trabalhos!")
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */