package Pratica04;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de a: ");
		a = input.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = input.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = input.nextDouble();
		if (a == 0 && b == 0 && c == 0)
			System.out.println("Igualdade confirmada: 0 = 0");
		if (a == 0 && b == 0 && c != 0)
			System.out.println("Coeficientes informados incorretamente");
		if (a == 0 && b != 0) {
			x1 = -c / b;
			System.out.println("Esta é uma equação de primeiro grau, o valor da raiz é: " + x1);
			if (a != 0) {
				delta = (b * b) - (4 * a * c);
				x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
				x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
				if (delta < 0) {
					System.out.println("Esta equação não possui raízes reais");
				} else if (delta == 0) {
					System.out.println("Esta equação possui duas raízes reais iguais: " + x1);
				} else {
					System.out.println(
							"Esta equação possui duas raízes reais diferentes, raiz 1: " + x1 + "\n raiz 2: " + x2);
				}
			}
		}
	}

}