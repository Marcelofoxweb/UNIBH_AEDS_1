/***************************************************************************************
 * Exercício 6:                                                                        *
 * 	Faça um programa em Java para ler uma variável de 100 elementos inteiros           *
 *  e verificar se existem elementos iguais a 30.                                      *
 *  Se existirem, escrever as posições em que estão armazenados;                       *
 *  caso contrário, imprimir a mensagem “Não há ocorrência do elemento 30 no vetor”.   *
 ***************************************************************************************/

package com.lista3_vetor;
import java.util.Scanner;
public class Ex6 
{
	public static void main(String[] args) 
	{
// 1º Passo: Informar a quantidade de índices para o vetor.
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de indices que terá o vetor: ");
		n = ler.nextInt();
		System.out.printf("\n");
		
// 2º Passo: Cria o Vetor A e preenche com valores aleatórios.
		int a[] = new int[n];
		int i;
		
		for(i = 0; i < n; i++)
		{
			a[i] = (int)Math.round(Math.random() * 32);
			System.out.printf("Vetor A: [%d] = %2d \n", i, a[i]);
		}
		System.out.printf("\n");
		
// 3º Passo: Verifica se o Vetor A 'POSSUI' valor igual a 30.
		int sim = 0, total = 0;
		for(i = 0; i < n; i++)
		{
			if (a[i] == 30)
			{
				sim = 1;
				total = total + 1;
				System.out.printf("Na %dº posição possui o valor igual à %2d. \n", i, a[i]);
			}
		}
		if(sim > 0)
		{
		System.out.printf("\nO número 30 foi encontrado em: " + total + " posição(ões).\n");
		}
		
		
// 4º Passo: Verifica se o Vetor A 'NÃO POSSUI' valor igual a 30.
		if (sim != 1)
		{
			System.out.printf("Não há ocorrência do elemento 30 no vetor.");
		}
	}
}