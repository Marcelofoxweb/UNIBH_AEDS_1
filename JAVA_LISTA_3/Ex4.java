/*******************************************************************************
 * Exerc�cio 4:                                                                *
 *	Fa�a um programa em Java que leia um conjunto de 50 inteiros               *
 *	e o imprima na ordem contr�ria da que foi lida.                            *
 *                                                                             *
 * Fonte de apoio:                                                             *
 *  	http://www.pb.utfpr.edu.br/omero/Java/Fontes/Lista%20Vetores/_28.Htm   *
 *******************************************************************************/

package com.lista3_vetor;
import java.util.Scanner; 
public class Ex4 
{
	public static void main(String[] args) 
	{
		
// 1� Passo: Informar a quantidade de �ndices para o vetor.
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de �ndices que ter� o 'Vetor A': ");
		n = ler.nextInt();
			

// 2� Passo: Ir� gerar os elementos (valores) aleatoriamente para o Vetor A.		
		int i, j;
	    int a[] = new int[n];
	    int b[] = new int[n];
 
	    for (i=0; i<n; i++) 
	    {
	    	a[i] = (int)Math.round(Math.random() * 100); // Gera n�meros aleat�rios
	    }
	    j = n - 1 ; // ultima posicao de "b"
	    

// 3� Passo: Ir� gerar o Vetor B invertendo a ordem do elemento gerada no Vetor A.	    
	    for (i=0; i<n; i++) 
	    {
	        b[j] = a[i];
	        j = j - 1; // penultima, antepenultima, ... posicoes de "b"
	    }

	    
// 4� Passo: Ir� imprimir o �ndice e elemento dos vetores A e B.	   
	    System.out.printf("\nOs elementos do 'Vetor A' estao invertidos no 'Vetor B':\n");
	    
	    for (i=0; i<n; i++) 
	    {
	        System.out.printf("Vetor A [%d] = %2d    |     Vetor B [%d] = %2d\n", i, a[i], i, b[i]);
	    }
	}
}