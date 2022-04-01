package teste;
import java.util.Scanner;
public class Atv04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso, imc, altura;
		System.out.println("Insira o peso: ");
		peso = sc.nextFloat();
		System.out.println("Insira a altura: (EX: 1,67)");
		altura = sc.nextFloat();
		imc = peso / (altura*altura);
		if(imc <20) {
			System.out.println("ABAIXO DO PESO");
		}else if (imc >20 && imc <=25) {
			System.out.println("Normal");
		}else if (imc >25 && imc <=30) {
			System.out.println("Sobrepeso");
		}else if (imc >30 && imc <=40) {
			System.out.println("OBESIDADE");
		}else if (imc >40) {
			System.out.println("OBESIDADE MORBIDA");
		}
		
	}

}