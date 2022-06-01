package Pratica04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os valores dos lados do triangulo: ");
		float lado1, lado2, lado3;
		lado1 = sc.nextFloat();
		lado2 = sc.nextFloat();
		lado3 = sc.nextFloat();
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilátero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Isósceles");
		} else {
			System.out.println("Escaleno");
		}
	}
}