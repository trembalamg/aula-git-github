package Pratica03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, pesoEngordar, pesoEmagrecer;
        System.out.println("Informe um peso: ");
        peso = sc.nextDouble();
        pesoEngordar = peso * 1.15;        
        pesoEmagrecer = 0.80 * peso;
        System.out.println("Se você engordar 15%, irá pesar: "+pesoEngordar);
        System.out.println("Se você emagrecer 20%, irá pesar: "+pesoEmagrecer);
        
    }
}