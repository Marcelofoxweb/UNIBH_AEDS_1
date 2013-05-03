/*************************************************************************************************
 * PROVA AEDs - DAD 2 - 02/05/2013                                                                   *
 * Quest�o 01:                                                                                   *
 * 	Fa�a um programa em java para ler um conjunto de 60 notas dos alunos de AEDs:                *
 * 		a) Armazen�-lo em um vetor NOTAS                                                         *
 * 		b) Imprimir a maior nota e as posi��es que elas ocupam no vetor (supor que h� empates)   * 
 *************************************************************************************************/

package com.Provas;
import javax.swing.JOptionPane;

public class DAD2_130502_01 
{
	public static void main(String[] args) 
	{
		int notas[] = new int[60];
		int maior = -1;
		
		for(int i = 0; i < notas.length; i++)
		{
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a "+ (i+1) + "� nota: " ));
			
			if(notas[i] > maior) maior = notas[i];
		}
		
		System.out.println("A maior nota �: " + maior);
		System.out.println("Posi��o no vetor: ");
		
		for(int j =0; j < notas.length; j++)
		{
			if(notas[j] == maior) System.out.println("Vetor notas ["+j+"]");
		}
	}
}