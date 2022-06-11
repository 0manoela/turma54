programa
{
	
	funcao inicio()
	{
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/


		inteiro meses, dias, anos, total
		
		escreva("Digite a sua idade:")
		leia(anos)

		escreva("Digite o mes em que nasceu:")
		leia(meses)

		escreva("Digite o dia:")
		leia(dias)

		total= anos*365 + meses*31 + dias

		escreva ("Você tem" , total , "dias de vida")
		

		
		


		
	}
		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */