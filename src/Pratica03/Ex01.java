package Pratica03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		System.out.println("Insira a primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.println("Insira a segunda nota: ");
		nota2 = sc.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3) /3;
		System.out.println("A média das notas é: "+media);
	}
}
