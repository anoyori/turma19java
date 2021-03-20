programa
{
	
	funcao inicio()
	{
		cadeia senha = "123"
		inteiro contador= 1
		const inteiro LIMITESENHA = 2

		escreva("Digite a senha: ")
		leia(senha)

		enquanto (senha != "123")
		{
			escreva("Senha incorreta, tente de novo. Tentativa: ",contador,": " )
			leia(senha)
			
			se(contador > LIMITESENHA)
			{
				escreva("Tentativa 3, bloqueio.\n")
				pare
			}
			contador++ //forma mais usada
			//contador = contador + 1
		}

		escreva("Programa finalizado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */