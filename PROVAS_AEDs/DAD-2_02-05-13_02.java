/*************************************************************************************************
 * PROVA AEDs - DAD 2 - 02/05/2013                                                               *
 * Questão 02:                                                                                   *
 * 	Faça um programa em Java para ler uma variável de 50 elementos inteiros:                     *
 * 		a) Verificar se existem elementos iguais a 100.                                          *
 * 		b) Se existir, escrever as posições em que estão armazenados;                            *
 * 		c) Caso contrário, imprimir mensagem "Não há ocorrencia de elemento 100 no vetor".       *
 *************************************************************************************************/

package com.Provas;
import javax.swing.JOptionPane;
public class DAD2_130502_02 
{
	public static void main(String[] args) 
	{
		int a[] = new int[50];
		int i;
		boolean e_100 = false;
		
		for( i = 0; i < a.length; i++)
		{
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
			if (a[i] == 100)
			{
				System.out.printf("Existe 100 na posição " + i + "\n");
				e_100 = true;
			}
		}
		if (e_100 != true)
		{
			System.out.printf("Não há ocorrência do elemento 100 no vetor.");
		}
	}
}