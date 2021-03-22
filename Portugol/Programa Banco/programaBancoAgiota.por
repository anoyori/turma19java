programa
 {
	
	inclua biblioteca Util --> U
	
	funcao inicio()
 {
		
		
inteiro tipoConta
		cadeia cpf
		real saldo = 1000
		cadeia opcaoPoupanca
		real debitoPoupanca
		real creditoPoupanca

		estilo()
		escreva("\n")
		escreva("\n            •AgiotaBank G7®• \n")
		estilo()
		escreva("\n")

		estilo()
		escreva("\n")
		escreva("\n     Aqui,você não fica nos devendo...\n")
		estilo()
		escreva("\n")
		escreva("\n")

		
		escreva("        [Carregando sistema...] \n")
		escreva("        ")
		
		para (inteiro x = 0; x < 23; x++) {

			escreva("█")	
			U.aguarde(200)
		}

		escreva("\n")
		escreva("\n         [Sistema carregado].")
		U.aguarde(2000)
		limpa()

		
		estilo2()
		escreva("\n")
		escreva("•ABank G7®•")
		escreva("\n")
		estilo3()
		escreva("\n")
		escreva("Aqui,você não fica nos devendo...\n")
		estilo2()
		escreva("\n")
		escreva("\n")
		escreva("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresa\n5 - Conta Estudantil" +
		"\n6 - Sair\n\nDigite o código da opção selecionada: ")
		leia(tipoConta)
		
		se (tipoConta < 1 ou tipoConta > 6) {
			
			escreva("Por favor, insira um valor válido para o tipo de conta.")
				
		} senao se (tipoConta == 1) {

			limpa()
			estilo2()
			escreva("\n")
			escreva("•ABank G7®•")
			escreva("\n")
			estilo3()
			escreva("\n")
			escreva("Aqui,você não fica nos devendo...\n")
			estilo2()
			escreva("\n")
			escreva("\n")
			
			escreva("• CONTA POUPANÇA \n")
			escreva("\nSaldo Atual: R$" + saldo + "\n")

			para (inteiro x = 0; x < 10; x++) {

				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoPoupanca)

				se (opcaoPoupanca == "Débito" ou opcaoPoupanca == "débito" ou opcaoPoupanca == "debito" 
				ou opcaoPoupanca == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoPoupanca)

					se (debitoPoupanca <= saldo) {
						saldo = saldo - debitoPoupanca
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				} senao se (opcaoPoupanca == "Crédito" ou opcaoPoupanca == "crédito" ou opcaoPoupanca == "credito" 
				ou opcaoPoupanca == "cred") {
					escreva("Quanto deseja adquirir? R$")
					leia(creditoPoupanca)

					saldo = saldo + creditoPoupanca
				} senao {
					escreva("\nPor favor, insira uma opção válida.\n")
				}
			} 

			cadeia diaAniversarioPoupanca = "20"
			cadeia valorDiaAniversarioPoupanca
			escreva("\nPor favor, insira o dia de aniversário de sua conta: ")
			leia(valorDiaAniversarioPoupanca)
			
			se (diaAniversarioPoupanca == valorDiaAniversarioPoupanca) {
				escreva("\nHoje é o aniversário de sua conta. O valor será corrigido em 0,05%.\n\nSeu novo saldo é: R$" +
				((saldo * 0.05) + saldo) + "\n")
			} senao {
				escreva("\nHoje não é o aniversário de sua conta.\n")
				escreva("\nObrigado por escolher o AgiotaBank® e volte sempre!\n")
				
			}








			
		} senao se (tipoConta == 2) {
			
		} senao se (tipoConta == 3) {
			especial()
			
		} senao se (tipoConta == 4) {
			empresa()
		
			
		} senao se (tipoConta == 5) {
			
		} senao {
			
			escreva("Obrigado por escolher o AgiotaBank® e volte sempre!")
				
		}
		
		

		
	}
		
	 funcao estilo() {
	 	escreva("________________________________________")
	 }

	 funcao estilo2() {
	 	escreva("__________________________________")
	 }

	 funcao estilo3() {
	 	escreva("----------------------------------")
	 }
	 funcao empresa() {
	 	
	 	real saldo = 1000.00
		real emprestimoEmpresa
		real valorEmprestimo = 0.00
		real limiteEmprestimo = 10000.00
			

		para (inteiro x = 0; x < 10; x++){
			escreva("\nVocê deseja solicitar um empréstimo? 1 - SIM / 2 - NÃO: ")
			leia(emprestimoEmpresa)
					
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
			escreva("\nSelecione uma alternativa válida")
		}
	}
 }
 	funcao especial()
	{
		cadeia x 
		real limiteMais = 1000.00
		real saldo = 1000.00
		real limiteEscolha = 0.00
		
                   		
		escreva("Olá, deseja efetuar uma compra? Seu limite é de: ", limiteMais, " reais. Digite Sim ou Não, para prosseguir ")
		leia(x)
		limpa()

          para(real y = 0.00; y < 10.00; y++){

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
 * @POSICAO-CURSOR = 3012; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */