package Pratica03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);         
	        double celsius, fahrenheit;
	        System.out.println("Digite um valor em celsius: ");
	        celsius = sc.nextDouble();
	        fahrenheit = (celsius * 1.8) + 32;
	        System.out.println("A temperatura em fahrenheit �: " + fahrenheit);
	    }
	}