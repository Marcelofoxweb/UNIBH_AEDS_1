/************************************************************************************************
 * Exerc�cio 3:                                                                                 *
 * 	Fa�a um programa em Java para ler um conjunto de 150 notas dos alunos de uma disciplina;    *
 * 		a) armazen�-lo em um vetor NOTAS                                                        * 
 * 		b) imprimir a menor nota e a posi��o que ocupam no vetor                                *
 * 		c) Imprimir a maior nota e a posi��o que ocupam no vetor                                *
 *  (supor que n�o h� empates).                                                                 *
 ************************************************************************************************/

package com.lista3_vetor;

import java.util.Scanner;

public class Ex3 
{
	public static void main(String[] args) 
	{

// 1� Passo: Informar a quantidade de �ndices para o vetor.
	    int n;
		Scanner ler = new Scanner(System.in);
	    System.out.printf("Informe a quantidade de alunos: ");
	    n = ler.nextInt();
	    System.out.printf("\n");

	    
// 2� Passo:  Para informar a nota dos alunos e gerar os elementos no vetor. 

		int notas[] = new int[n];
		int i = 0;

	    for(i = 0; i < n; i++)
		{
		     System.out.printf("Informe a nota do %2d� aluno de %d: ",(i+1), n);
		     notas[i] = ler.nextInt();
		}

	    System.out.println("\n\nRESPOSTAS:");
	    System.out.println("a) Notas informadas:");

		for(i = 0; i < n; i++)
		{
			System.out.printf("   NOTAS [%d] = %2d\n", i, notas[i]);
		}

		
// 3� Passo: Para verificar qual � a maior e a menor nota e a posi��o correspondente:
		int menor, posmenor, maior, posmaior;
		
		menor = notas[0]; posmenor = 0;
		maior = notas[0]; posmaior = 0;
		
		for(i = 1; i < n; i++)
		{
			 if (notas[i] < menor) 
			 {
				 menor = notas[i];
			     posmenor = i;
			 }
			 else if (notas[i] > maior) 
			 {
				 maior = notas[i];
			     posmaior = i;
			 }
		}
	   System.out.printf("\nb) Menor nota � %d. \n   Informada na posicao %d.\n", menor, posmenor);
	   System.out.printf("\nc) Maior nota � %d. \n   Informada na posicao %d.\n", maior, posmaior);
	}
}