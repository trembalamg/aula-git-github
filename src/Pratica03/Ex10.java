package Pratica03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, comprimento, area, volume;

		System.out.println("Insira um valor para o raio:");
		raio = sc.nextDouble();
		comprimento = 2 * Math.PI * raio;
		area = Math.PI * Math.pow(raio, 2);
		volume = 0.75 * Math.PI * Math.pow(raio, 3);

		System.out.println("O comprimento é: "+comprimento);
		System.out.println("A area é: "+area);
		System.out.println("O volume é: "+volume);

	}
}
