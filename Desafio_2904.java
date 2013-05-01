/************************************************************************************************
 * Exercício 2:                                                                                 *
 * 	Faça um programa em Java para ler um conjunto de 150 notas dos alunos de uma disciplina;    *
 * 		a) armazená-lo em um vetor NOTAS                                                        * 
 * 		b) Imprimir a maior nota e a posição que ocupam no vetor                                *
 *  (supor que há empates).                                                                     *
 ************************************************************************************************/

package com.listaexerciciojavavetor1;

import java.util.Scanner;

public class Ex2 
{
	public static void main(String[] args) 
	{

// 1º Passo: Informar a quantidade de índices para o vetor.
	    int n;
		Scanner ler = new Scanner(System.in);
	    System.out.printf("Informe a quantidade de alunos: ");
	    n = ler.nextInt();
	    System.out.printf("\n");

	    
// 2º Passo:  Para informar a nota dos alunos e gerar os elementos no vetor. 

		int notas[] = new int[n];
		int i = 0;

	    for(i = 0; i < n; i++)
		{
		     System.out.printf("Informe a nota do %2dº aluno de %d: ",(i+1), n);
		     notas[i] = ler.nextInt();
		}

	    System.out.println("\n\nRESPOSTAS:");
	    System.out.println("a) Notas informadas:");

		for(i = 0; i < n; i++)
		{
			System.out.printf("   NOTAS [%d] = %2d\n", i, notas[i]);
		}

		
// 3º Passo: Para verificar qual é a maior nota e a posição correspondente:
		int maior, posmaior;
		
		maior = notas[0]; posmaior = 0;
		
		for(i = 1; i < n; i++)
		{
			 if (notas[i] > maior) 
			 {
				 maior = notas[i];
			     posmaior = i;
			 }
		}
	   System.out.printf("\nb) Maior nota é %d. \n   Informada na posicao %d.\n", maior, posmaior);
	}
}