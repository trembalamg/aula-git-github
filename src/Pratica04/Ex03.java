package Pratica04;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		System.out.println("Insira a primeira nota: ");
		nota1 = sc.nextFloat();

		System.out.println("Insira a segunda nota: ");
		nota2 = sc.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Sua média é: " + media);
		if (media >= 0 && media < 3) {
			System.out.println("REPROVADO!");
		} else if (media >= 3 && media < 7) {
			System.out.println("EXAME");

		} else if (media >= 7 && media <= 10) {
			System.out.println("APROVADO");
		}

	}
}