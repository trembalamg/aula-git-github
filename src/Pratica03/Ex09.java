package Pratica03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cateto1, cateto2, hipotenusa;
		System.out.println("Digite um valor para o cateto 1:");
		cateto1 = sc.nextDouble();
		System.out.println("Digite um valor para o cateto 2:");
		cateto2 = sc.nextDouble();
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("O valor da hipotenusa é igual a: "+hipotenusa);

	}

}
