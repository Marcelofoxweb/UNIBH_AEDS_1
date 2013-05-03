/*************************************************************************************************
 * PROVA AEDs - DAD 2 - 02/05/2013                                                               *
 * Quest�o 02:                                                                                   *
 * 	Fa�a um programa em Java para ler uma vari�vel de 50 elementos inteiros:                     *
 * 		a) Verificar se existem elementos iguais a 100.                                          *
 * 		b) Se existir, escrever as posi��es em que est�o armazenados;                            *
 * 		c) Caso contr�rio, imprimir mensagem "N�o h� ocorrencia de elemento 100 no vetor".       *
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
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		
			if (a[i] == 100)
			{
				System.out.printf("Existe 100 na posi��o " + i + "\n");
				e_100 = true;
			}
		}
		if (e_100 != true)
		{
			System.out.printf("N�o h� ocorr�ncia do elemento 100 no vetor.");
		}
	}
}