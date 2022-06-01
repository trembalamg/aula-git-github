/*Leia 10 números reais a partir do teclado e os armazene em um vetor. O algoritmo deve
imprimir o vetor, o menor e o maior número informado.*/

package Pratica08;

import java.util.Scanner;

public class Atv03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, maior = 0, menor = 9999999;
		int[] vetor = new int[3];
		for (i = 0; i < vetor.length; i++) {

			System.out.println("Informe um número: \n");
			vetor[i] = input.nextInt();
			if (vetor[i] < menor) {
				menor = vetor[i];
			} else if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("Maior numero: " + maior + ", Menor numero: " + menor);
	}

}
