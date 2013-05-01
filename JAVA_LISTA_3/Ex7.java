/*******************************************************************************************************
 * Exerc�cio 7:                                                                                        *
 * 	Fa�a um programa em Java para ler 30 valores inteiros, armazen�-los em um vetor, e em seguida:     *
 * 		a) Imprimir os dois maiores valores contidos no vetor;                                         *
 * 		b) Imprimir todos os elementos maiores que a m�dia aritm�tica dos valores do vetor,            *
 * 		   e suas respectivas posi��es no vetor.                                                       *
 *******************************************************************************************************/

package com.lista3_vetor;
import java.util.Scanner;
public class Ex7 
{
	public static void main(String[] args) 
	{
// 1� Passo: 
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de �ndices para o vetor: ");
		n = ler.nextInt();
		System.out.printf("\n");
		
// 2� Passo:
		int a[] = new int[n];
		int i;
		
		for(i = 0; i < n; i++)
		{
			a[i] = (int)Math.round(Math.random() * 100);
			System.out.printf("   Vetor A: [%d] = %2d \n", i, a[i]);
		}
		
// 3� Passo:
        int aux;
        boolean trocou = true;
        while(trocou) 
        {
            trocou = false;
            for(i = 0; i < n-1; i++) 
            {
                if(a[i] > a[i+1]) 
                {
                    aux    = a[i];
                    a[i]   = a[i+1];
                    a[i+1] = aux;
                    trocou = true;
                }
            }
        }
        
// 4� Passo: Exibi��o do resultado da ordena��o
        System.out.println("\nVetor ordenado:");
        for(i = 0; i < n; i++) 
        {
        	System.out.printf("   Vetor A: [%d] = %2d \n", i, a[i]);
        	//            System.out.println(a[i]); 
        }
        
        
// 5� Passo:
        int total = 0;
        System.out.printf("\nSoma dos valores dos elementos do vetor:");
        for(i = 0; i < n; i++) 
        {
        	total = total + a[i];
        }
        System.out.println("\n   " + total);
        System.out.println("\nM�dia dos valores dos elementos do vetor:\n   " + total/n);
        
// 6� Passo:
        System.out.printf("\nRESPOSTAS:");
        System.out.printf("\na) Os dois maiores valores s�o: \n   " + a[n-1] + " e " + a[n-2] + "\n");
	
// 7� Passo:
        System.out.printf("\nb) Os valores acima da m�dia s�o: \n");
        for(i = 0; i < n; i++) 
        {
        	if(a[i] > (total/n))
        	{
                System.out.print("   " + a[i]);
        	}
 
        }
        
	}
}