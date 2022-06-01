package Pratica04;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float nota1, nota2, media;
	System.out.println("Insira a primeira nota: ");
	nota1 = sc.nextFloat();

	System.out.println("Insira a segunda nota: ");
	nota2 = sc.nextFloat();
	media = (nota1 + nota2) /2;
	System.out.println("Sua média é: "+media);
	if (media <7) {
		System.out.println("REPROVADO!");
	}else if (media >=7){
		System.out.println("APROVADO");
	}
}

}