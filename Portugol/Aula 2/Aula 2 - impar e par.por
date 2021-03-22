programa
{
	
	funcao inicio()
	{
		inteiro numero

		//número precisa ser inteiro e positivo
	

		escreva("Digite seu número: ")
		leia(numero)

		se(numero == 0)
		{
			escreva("Zero é um número neutro")
						
		}
		senao se (numero % 2 == 0){
			escreva("Seu número é par")
			
		}
		senao se (numero < 0)
		{
			escreva("Número é negativo")
			
		}					
		senao
		{
			escreva("Seu número é impar")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */