programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
/*Exercício 3 - Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

 */

	inteiro matrizN1 [4][6]
	inteiro matrizN2 [4][6]
	inteiro matrizSoma [4][6]
	inteiro matrizSub [4][6]
	inteiro numero = 0

	para(inteiro l=0; l<4; l++){
		para(inteiro c=0; c<6; c++){
			numero = Util.sorteia(1, 9)
			matrizN1[l][c]=numero
			numero = Util.sorteia(1, 9)
			matrizN2[l][c] = numero
			matrizSoma[l][c]= matrizN1[l][c] + matrizN2[l][c]
			matrizSub[l][c] = matrizN1[l][c] - matrizN2[l][c]
			//escreva(matrizN1[l][c]," ")
		}
		
	}
		escreva("Matriz N1\n")
		para (inteiro l=0; l<4; l++){
			para (inteiro c=0; c<6; c++)
			{
				escreva(matrizN1[l][c]," ")
			}
			escreva("\n") 
		}
	
		escreva("\nMatriz N2\n")
		para (inteiro l=0; l<4; l++){
			para (inteiro c=0; c<6; c++)
			{
				escreva(matrizN2[l][c]," ")
			}
			escreva("\n") 

		}
		escreva("\nM1 \n")
		para (inteiro l=0; l<4; l++){
			para (inteiro c=0; c<6; c++){
			escreva(matrizSoma[l][c], " ")	
			}
			escreva("\n")	
		}
		escreva("\n")	
		escreva("\nM2 \n")
		para (inteiro l=0; l<4; l++){
			para (inteiro c=0; c<6; c++){
			escreva(matrizSub[l][c], " ")	
			}
			escreva("\n")	
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 858; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */