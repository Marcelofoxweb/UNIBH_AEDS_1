/*******************************************************************************************************
 * Exercício 7:                                                                                        *
 * 	Faça um programa em Java para ler 30 valores inteiros, armazená-los em um vetor, e em seguida:     *
 * 		a) Imprimir os dois maiores valores contidos no vetor;                                         *
 * 		b) Imprimir todos os elementos maiores que a média aritmética dos valores do vetor,            *
 * 		   e suas respectivas posições no vetor.                                                       *
 *******************************************************************************************************/

package com.lista3_vetor;
import java.util.Scanner;
public class Ex7 
{
	public static void main(String[] args) 
	{
// 1º Passo: 
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a quantidade de índices para o vetor: ");
		n = ler.nextInt();
		System.out.printf("\n");
		
// 2º Passo:
		int a[] = new int[n];
		int i;
		
		for(i = 0; i < n; i++)
		{
			a[i] = (int)Math.round(Math.random() * 100);
			System.out.printf("   Vetor A: [%d] = %2d \n", i, a[i]);
		}
		
// 3º Passo:
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
        
// 4º Passo: Exibição do resultado da ordenação
        System.out.println("\nVetor ordenado:");
        for(i = 0; i < n; i++) 
        {
        	System.out.printf("   Vetor A: [%d] = %2d \n", i, a[i]);
        	//            System.out.println(a[i]); 
        }
        
        
// 5º Passo:
        int total = 0;
        System.out.printf("\nSoma dos valores dos elementos do vetor:");
        for(i = 0; i < n; i++) 
        {
        	total = total + a[i];
        }
        System.out.println("\n   " + total);
        System.out.println("\nMédia dos valores dos elementos do vetor:\n   " + total/n);
        
// 6º Passo:
        System.out.printf("\nRESPOSTAS:");
        System.out.printf("\na) Os dois maiores valores são: \n   " + a[n-1] + " e " + a[n-2] + "\n");
	
// 7º Passo:
        System.out.printf("\nb) Os valores acima da média são: \n");
        for(i = 0; i < n; i++) 
        {
        	if(a[i] > (total/n))
        	{
                System.out.print("   " + a[i]);
        	}
 
        }
        
	}
}