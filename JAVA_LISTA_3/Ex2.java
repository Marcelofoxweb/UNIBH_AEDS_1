/************************************************************************************************
 * Exerc�cio 2:                                                                                 *
 * 	Fa�a um programa em Java para ler um conjunto de 150 notas dos alunos de uma disciplina;    *
 * 		a) armazen�-lo em um vetor NOTAS                                                        * 
 * 		b) Imprimir a maior nota e a posi��o que ocupam no vetor                                *
 *  (supor que h� empates).                                                                     *
 ************************************************************************************************/

package com.lista3_vetor;

import java.util.Scanner;

public class Ex2 
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

		
// 3� Passo: Para verificar qual � a maior nota e a posi��o correspondente:
		int maior;
		
		maior = notas[0];
		
		for(i = 1; i < n; i++)
		{
			 if (notas[i] > maior) 
			 {
				 maior = notas[i];
			 }
		}
			
		
// 4� Passo: Verificar as posi��es que a maior nota � armazenada no vetor.		
		String maior_nota_indexes = " ";
		
		for(int j = 0; j < notas.length; j++){
			if(notas[j] == maior){
				maior_nota_indexes += j + " ";
			}
		}

		System.out.println("\nb) Maior nota informada: " + maior + "\n   Informada na posição: (" + maior_nota_indexes + ") do vetor.");			
	}
}
