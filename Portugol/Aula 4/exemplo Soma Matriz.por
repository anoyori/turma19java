programa
{
	
	funcao inicio()
	{
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal. 
 */

 	inteiro matriz [3][3]
 	inteiro matrizTeste [3][3]
 	inteiro matrizSoma [3][3]
 	inteiro totalDiagonal = 0

 	para(inteiro linha=0; linha <3; linha++){
 		para(inteiro coluna = 0; coluna <3; coluna ++){
 			escreva("Digite o valor da linha ", linha, " coluna ", coluna, ": ")
 			leia(matriz[linha][coluna])
 			matrizSoma[linha][coluna] = matriz[linha][coluna] + matrizTeste[linha][coluna]
 				se(linha==coluna){
 					totalDiagonal = totalDiagonal + matriz[linha][coluna]
 				}
 		}
 	}
 	para(inteiro linha=0; linha<3; linha++){
 		para(inteiro coluna=0; coluna<3;coluna++){
 		escreva(matriz[linha][coluna], " ")
 	}
 	escreva("\n")
	}
	escreva("Valor da diagonal principal: ", totalDiagonal)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */