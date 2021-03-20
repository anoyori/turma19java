programa
{
	
	funcao inicio()
	{
	
	/*Exercício 8 - O custo ao consumidor de um carro novo é a soma do custo 
	 * de fabrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fabrica). 
	 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
	 */
	
	real custoConsumidor, custoFabrica, distribuidor, imposto

	escreva("Qual o custo de fábrica do carro? R$ ")
	leia(custoFabrica)

	distribuidor = 0.28*custoFabrica
	imposto = 0.45*custoFabrica
	custoConsumidor = custoFabrica + distribuidor + imposto

	escreva("O custo do carro ao consumidor é R$ ", custoConsumidor)
	


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */