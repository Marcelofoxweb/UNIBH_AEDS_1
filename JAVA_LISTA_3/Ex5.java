/******************************************************************************************
 * Exerc�cio 5:                                                                           *
 * 	Fa�a um programa em Java que leia dois vetores de 25 elementos inteiros cada;         *
 *  intercale os elementos destes dois conjuntos formando um novo vetor de 50 posi��es    *
 *  e imprima o resultado.                                                                *
 *                                                                                        *
 *  Fonte de apoio:                                                                       *
 *  	http://www.pb.utfpr.edu.br/omero/Java/Fontes/Lista%20Vetores/_29.Htm              *
 ******************************************************************************************/

package com.lista3_vetor;
import java.util.Scanner;
public class Ex5 
{
	public static void main(String[] args) 
	{
// 1� Passo: Informar a quantidade de �ndices para o vetor.
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de �ndices que ter� o vetor: ");
		n = ler.nextInt();

		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n*2];
		
		int i, j;

// 2� Passo: Gerar elementos para os Vetores A e B com valores aleat�rios.		
	    for (i = 0; i < n; i++) 
	    {
	    	a[i] = (int)Math.round(Math.random() * 99); // Gera n�meros aleat�rios
	    	b[i] = (int)Math.round(Math.random() * 99); // Gera n�meros aleat�rios
	    }

// 3� Passo: Cria a posi��o de 25 a 49 para o vetor C.	    
	    j = n;
	    
// 4� Passo: Cria o vetor C e preenche com os elementos dos vetores A e B
	    for (i = 0; i < n; i++) 
	    {
	    	c[i] = a[i];
	    	c[j] = b[i];
	    	j = j + 1;
	    }

// 5� Passo: Exibe os vetores A e B
		for (i = 0; i < n; i++) 
		{
		  System.out.printf("Vetor A: [%d] = %2d   |   Vetor B: [%d] = %2d \n" , i, a[i], i, b[i]);
		}
	    System.out.printf("\n");

// 6� Passo: Exibe os elementos do vetor C. 		
		for (i = 0; i < (2*n); i++) 
		{
		  System.out.printf("Vetor C: [%d] = %2d \n",i, c[i]);
		}
	}
}