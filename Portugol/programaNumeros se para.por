programa
{
	
	funcao inicio()
	{
		//[0-9] - maxDix
		//mostra numero de 4 digitos sendo que não pode ser maior que o maxDix
		//a soma dos 4 digitos tem que dar 21
		//Exemplos com maxDiz=6: 3666, 4566

		inteiro maxDix

		escreva("Digite um número entre 1-9:")
		leia(maxDix)

		para(inteiro p=0; p<=maxDix; p++){
			//escreva(p, "\n") // primeiro numero
			//se(p<=maxDix){
				para(inteiro s=0; s<=maxDix; s++){
					//se (s<= maxDix){
						para(inteiro t=0; t<= maxDix; t++)	{
							//se(t<=maxDix){
								para(inteiro  q=0; q<=maxDix; q++){
									se((p+s+t+q)==21){
										escreva(p,s,t,q, "\n")
									}
								}
							}
						}
					}
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
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */