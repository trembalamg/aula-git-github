package POO;

import java.util.Scanner;

public class Principal {
	public static void main(String Args[]) {
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a altura do ret�ngulo: ");
		ret.setAltura(input.nextFloat());
		System.out.print("Informe a largura do ret�ngulo: ");
		ret.setLargura(input.nextFloat());
		//System.out.println("A area �: " + ret.calculaArea());
		//System.out.println("O perimetro �: " + ret.calculaPerimetro());
		
		ret.exibe();

	
	}
}