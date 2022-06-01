package Pratica03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            
    double salarioFuncioanrio;        
    System.out.println("Informe o salario");
    salarioFuncioanrio = sc.nextDouble();
    System.out.println("Novo salário com reajuste de 25%: " + ((0.25 * salarioFuncioanrio)+salarioFuncioanrio));
}    
}