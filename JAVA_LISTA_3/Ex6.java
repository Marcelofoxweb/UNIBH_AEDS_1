/***************************************************************************************
 * Exerc�cio 6:                                                                        *
 * 	Fa�a um programa em Java para ler uma vari�vel de 100 elementos inteiros           *
 *  e verificar se existem elementos iguais a 30.                                      *
 *  Se existirem, escrever as posi��es em que est�o armazenados;                       *
 *  caso contr�rio, imprimir a mensagem �N�o h� ocorr�ncia do elemento 30 no vetor�.   *
 ***************************************************************************************/

package com.lista3_vetor;
import java.util.Scanner;
public class Ex6 
{
	public static void main(String[] args) 
	{
// 1� Passo: Informar a quantidade de �ndices para o vetor.
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de indices que ter� o vetor: ");
		n = ler.nextInt();
		System.out.printf("\n");
		
// 2� Passo: Cria o Vetor A e preenche com valores aleat�rios.
		int a[] = new int[n];
		int i;
		
		for(i = 0; i < n; i++)
		{
			a[i] = (int)Math.round(Math.random() * 32);
			System.out.printf("Vetor A: [%d] = %2d \n", i, a[i]);
		}
		System.out.printf("\n");
		
// 3� Passo: Verifica se o Vetor A 'POSSUI' valor igual a 30.
		int sim = 0, total = 0;
		for(i = 0; i < n; i++)
		{
			if (a[i] == 30)
			{
				sim = 1;
				total = total + 1;
				System.out.printf("Na %d� posi��o possui o valor igual � %2d. \n", i, a[i]);
			}
		}
		if(sim > 0)
		{
		System.out.printf("\nO n�mero 30 foi encontrado em: " + total + " posi��o(�es).\n");
		}
		
		
// 4� Passo: Verifica se o Vetor A 'N�O POSSUI' valor igual a 30.
		if (sim != 1)
		{
			System.out.printf("N�o h� ocorr�ncia do elemento 30 no vetor.");
		}
	}
}