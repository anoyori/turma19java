programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
/* Exercício 3 - Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
* 
*/
		real n1 = 0
		real n2, n3, n4, quad1, quad2, quad3, quad4

		
		escreva("Digite o primeiro número: ")
		leia(n1)

		escreva("Digite o segundo número: ")
		leia(n2)

		escreva("Digite o terceiro número: ")
		leia(n3)

		escreva("Digite o quarto número: ")
		leia(n4)

		limpa()

		quad1 = mat.potencia(n1, 2)
		quad2 = mat.potencia(n2, 2)
		quad3 = mat.potencia(n3, 2)
		quad4 = mat.potencia(n4, 2)

		
		se(quad3 >= 1000){
			escreva("O quadrado de ", n3, " é igual a ", quad3)
		}
		senao{
			escreva("O quadrado de ", n1, " é igual a ", quad1,"\n")
			escreva("O quadrado de ", n2, " é igual a ", quad2,"\n")
			escreva("O quadrado de ", n3, " é igual a ", quad3,"\n")
			escreva("O quadrado de ", n4, " é igual a ", quad4,"\n")
		}


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */