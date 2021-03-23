programa
{
	
	funcao inicio()
	{

		real saldo = 1000.00
		real limite
		real emprestimoEmpresa
		real valorEmprestimo = 0.00
		real limiteEmprestimo = 10000
		

		
		escreva("Você deseja solicitar um empréstimo? 1 - SIM / 2 - NÃO: ")
		leia(emprestimoEmpresa)

		para (inteiro x = 0; x < 10; x++){
		
		se(emprestimoEmpresa == 1){
			escreva("\nQual valor do empréstimo? R$ ")
			leia(valorEmprestimo)

			se(valorEmprestimo <= limiteEmprestimo){
				saldo = saldo + valorEmprestimo
				limiteEmprestimo = limiteEmprestimo - valorEmprestimo
				escreva("\nSeu saldo atual é: R$ ", saldo, ". O limite disponível para empréstimo é R$ ", limiteEmprestimo)
			}

			senao se(valorEmprestimo > limiteEmprestimo){
				escreva("\nLamento, mas você não pode solicitar valores acima de R$ 10000")
			}
		}		
	
		senao se (emprestimoEmpresa == 2){
			escreva("\nObrigado, volte sempre!")
		}
		senao{
			escreva("\nSelecione uma alternativa valida")
		}
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */