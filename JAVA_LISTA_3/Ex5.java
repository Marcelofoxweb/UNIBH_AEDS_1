/******************************************************************************************
 * Exercício 5:                                                                           *
 * 	Faça um programa em Java que leia dois vetores de 25 elementos inteiros cada;         *
 *  intercale os elementos destes dois conjuntos formando um novo vetor de 50 posições    *
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
// 1º Passo: Informar a quantidade de índices para o vetor.
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de índices que terá o vetor: ");
		n = ler.nextInt();

		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n*2];
		
		int i, j;

// 2º Passo: Gerar elementos para os Vetores A e B com valores aleatórios.		
	    for (i = 0; i < n; i++) 
	    {
	    	a[i] = (int)Math.round(Math.random() * 99); // Gera números aleatórios
	    	b[i] = (int)Math.round(Math.random() * 99); // Gera números aleatórios
	    }

// 3º Passo: Cria a posição de 25 a 49 para o vetor C.	    
	    j = n;
	    
// 4º Passo: Cria o vetor C e preenche com os elementos dos vetores A e B
	    for (i = 0; i < n; i++) 
	    {
	    	c[i] = a[i];
	    	c[j] = b[i];
	    	j = j + 1;
	    }

// 5º Passo: Exibe os vetores A e B
		for (i = 0; i < n; i++) 
		{
		  System.out.printf("Vetor A: [%d] = %2d   |   Vetor B: [%d] = %2d \n" , i, a[i], i, b[i]);
		}
	    System.out.printf("\n");

// 6º Passo: Exibe os elementos do vetor C. 		
		for (i = 0; i < (2*n); i++) 
		{
		  System.out.printf("Vetor C: [%d] = %2d \n",i, c[i]);
		}
	}
}