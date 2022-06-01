package Pratica02;

import java.util.Scanner;

public class EX01 {
	public static void main(String args[]) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de x: ");
		x = sc.nextInt();
		System.out.println("Insira o valor de y: ");
		y = sc.nextInt();
		System.out.println("Insira o valor de z: ");
		z = sc.nextInt();
		
		System.out.println("X + Y - Z = : "+(x+y-z));
	}
}