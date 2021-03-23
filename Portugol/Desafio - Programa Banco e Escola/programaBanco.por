programa
{
	
	funcao inicio()
	{
		inteiro numero
		cadeia cpf
		real saldo = 3000.00
		logico ativa
		inteiro diaAniversarioPoupanca
		inteiro contadorTalao
		real limite
		real emprestimoEmpresa
		inteiro tipoConta
		real valorEmprestimo = 0.00
		real limiteEmprestimo = 10000
		

		
		escreva("Você deseja solicitar um empréstimo? 1 - SIM / 2 - NÃO: ")
		leia(emprestimoEmpresa)
		
		se(emprestimoEmpresa == 1){
			escreva("Qual valor do empréstimo? R$ ")
			leia(valorEmprestimo)

			se(valorEmprestimo <= limiteEmprestimo){
				saldo = saldo + valorEmprestimo
				limiteEmprestimo = limiteEmprestimo - valorEmprestimo
				escreva("Seu saldo atual é: R$ ", saldo, ". O limite disponível para empréstimo é R$ ", limiteEmprestimo)
			}

			senao se(valorEmprestimo > limiteEmprestimo){
				escreva("Lamento, mas você não pode solicitar valores acima de R$ 10000")
			}
		}		
	
			senao se (emprestimoEmpresa == 2){
				escreva("Obrigado, volte sempre!")
			}
			senao{
				escreva("Selecione uma alternativa valida")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */