//Leia 10 n�meros inteiros a partir do teclado e os armazene em um vetor. O algoritmo
//deve imprimir o vetor e apresentar a soma dos n�meros pares.
package Pratica08;

import java.util.Scanner;

public class Atv01 {
	public static void main(String[] args) {

		int i;
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		for (i = 0; i < vetor.length; i++) {

			System.out.println("Informe um n�mero: \n");
			vetor[i] = input.nextInt();
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];

			}

		}
		if (soma <= 0)
			System.out.println("N�o foram digitados n�meros pares!");
		else
			System.out.println(soma);
	}

}
