/*Leia 10 n�meros reais a partir do teclado e os armazene em um vetor. O algoritmo deve
imprimir o vetor e as posi��es do vetor que armazenam n�meros negativos.*/

package Pratica08;

import java.util.Scanner;

public class Atv02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int[] vetor = new int[3];
		for (i = 0; i < vetor.length; i++) {

			System.out.println("Informe um n�mero: \n");
			vetor[i] = input.nextInt();

		}
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println("Posi��o: " + i + " numero: " + vetor[i]);
			}
		}

	}

}
