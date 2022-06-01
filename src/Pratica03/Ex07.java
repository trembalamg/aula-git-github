package Pratica03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMinimo, salarioFuncionario;
		System.out.println("Insira o valor do salário mínimo: ");
		salarioMinimo = sc.nextDouble();
		System.out.println("Insira o salário do Funcionário: ");
		salarioFuncionario = sc.nextDouble();
		System.out.println("VocÊ recebe "+salarioFuncionario/salarioMinimo+" salários mínimos");
	}
}