programa
{
	
	funcao inicio()
	{
		real salario = 0.00
		inteiro filhos = 0
		const real HABITANTES = 2
		real mediaSalarios = 0.00
		real totalSalarios = 0.00
		real mediaFilhos = 0.00
		real totalFilhos = 0.00
		real maiorSalario = 0.00
		real percentualAte100 = 0.00
		inteiro contarPessoas = 0

		//entradas

		para(inteiro x=1; x<=HABITANTES; x++){

			escreva("Habitantes: ", x,"\n")
			escreva("Qual o seu salário? R$ ")
			leia(salario)
			totalSalarios = totalSalarios+salario
	
			escreva("Quantos filhos você tem? " )
			leia(filhos)
			totalFilhos = totalFilhos + filhos
			linha()

			//maiorSalario = 0.00
			//salario = 100

			se(maiorSalario < salario)
			{
				maiorSalario = salario
			}
			//maiorSalario será 100.00

			se(salario <= 100){
				contarPessoas++
			}
			
		}

		escreva("\nTotal de salarios: R$ ", totalSalarios)
		escreva("\nTotal de filhos: ",totalFilhos)
		escreva("\nMaior salário: R$ ", maiorSalario)

		percentualAte100 = (contarPessoas / HABITANTES) * 100
		escreva("\nPercentual de pessoas que ganham até R$ 100: ", percentualAte100, "%")

		mediaSalarios = totalSalarios / HABITANTES
		mediaFilhos = totalFilhos / HABITANTES

		escreva("\nMédia de salários: R$ ", mediaSalarios)
		escreva("\nMédia de filhos: ", mediaFilhos)
		pula()
		linha()

		escreva("Fim do programa")
		pula()
		linha()
			
		}
		
		funcao linha()
		{
			escreva("----------------------------------------\n")
		}
		
		funcao pula()
		{
			escreva("\n")
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 103; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */