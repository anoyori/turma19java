programa
{
	
	funcao inicio()
	{
		cadeia x 
		real limiteMais = 1000.00
		real saldo = 1000.00
		real limiteEscolha = 0.00
		
                   		
		escreva("Olá, deseja efetuar uma compra? Seu limite é de: ", limiteMais, " reais. Digite Sim ou Não, para prosseguir ")
		leia(x)
		limpa()

          para(real y = 0.00; y < 3.00; y++){

 			se( x == "S" ou x == "Sim" ou x == "sim" ou x == "s" ou x == "SIM") {
			escreva("\nQuanto de limite especial você deseja?: ")
			leia(limiteEscolha)

				se(limiteEscolha <= limiteMais){
					escreva("Sua transação foi finalizada com sucesso!")
	
					limiteMais = limiteMais - limiteEscolha
					escreva("\nSeu limite atual é: ", limiteMais)
	
					saldo = saldo + limiteEscolha
					escreva("\nO valor atual de seu saldo é: ", saldo)
				}
			
						 se( limiteEscolha > limiteMais)
						 {
						 	escreva("Transação fora de seu limite disponível.")
						 }
			
			 }
          }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */