package Pratica03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMinimo, salarioFuncionario;
		System.out.println("Insira o valor do sal�rio m�nimo: ");
		salarioMinimo = sc.nextDouble();
		System.out.println("Insira o sal�rio do Funcion�rio: ");
		salarioFuncionario = sc.nextDouble();
		System.out.println("Voc� recebe "+salarioFuncionario/salarioMinimo+" sal�rios m�nimos");
	}
}