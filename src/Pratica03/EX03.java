package Pratica03;
import java.util.Scanner;
public class EX03 {

	public static void main(String[] args) {
        double cotacaoDolar, dolares;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cota��o do dolar em reais");
        cotacaoDolar = sc.nextDouble();        
        System.out.println("Digite um valor em dolares");
        dolares = sc.nextDouble();        
        System.out.println("O valor em reais � igual a :" + (cotacaoDolar * dolares));
    }    
}