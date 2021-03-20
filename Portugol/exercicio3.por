programa
{

    funcao inicio()
    {
    	/* Exercício 3 - Faça um sistema que leia o tempo de duração de um evento em 
    	 *  uma fábrica expressa em segundos mostre-o expresso em horas, minutos segundos.
	*/

	//1 hora = 3600 segundos
	//1 minuto = 60 segundos
	
        inteiro tempoSegundos, horas,minutos, segundos
        
        escreva("Qual a duração do evento em segundos? ")
        leia(tempoSegundos)
        
        horas = tempoSegundos/(3600)
        minutos = tempoSegundos%(3600)/60
        segundos = tempoSegundos%(3600)%60

        escreva("O tempo do evento é ",horas, " horas, ",minutos," minutos e ",segundos, " segundos.")

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