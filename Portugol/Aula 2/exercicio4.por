programa
{
	
	funcao inicio()
	{
		
/* Exercício 4 - Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
se este número é par ou ímpar, e se é positivo ou negativo.
 */
 
		inteiro numero = 0

		//número pode ser: positivo, negativo, par ou impar

		escreva("Digite seu número: ")
		leia(numero)

		se(numero == 0){
			escreva("Zero é um número neutro")			
		}
		
			senao se (numero % 2 == 0){
				escreva("Número é par e ")
			
			}
					
		senao{
			escreva("Número é impar e ")
		}

		 se (numero < 0){
			escreva("é negativo")
			
		}
		senao se (numero > 0){
			escreva("é positivo")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */