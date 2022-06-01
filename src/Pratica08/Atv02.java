/*Leia 10 números reais a partir do teclado e os armazene em um vetor. O algoritmo deve
imprimir o vetor e as posições do vetor que armazenam números negativos.*/

package Pratica08;

import java.util.Scanner;

public class Atv02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int[] vetor = new int[3];
		for (i = 0; i < vetor.length; i++) {

			System.out.println("Informe um número: \n");
			vetor[i] = input.nextInt();

		}
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println("Posição: " + i + " numero: " + vetor[i]);
			}
		}

	}

}
