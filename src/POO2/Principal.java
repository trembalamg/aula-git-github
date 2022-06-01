package POO2;

import java.util.Scanner;

public class Principal {
	public static void main(String Args[]) {
		int numeroConta, agencia;
		float saldo, saque, deposito;
		Scanner sc = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		System.out.println("Insira o numero da sua conta: ");
		numeroConta= sc.nextInt();
		System.out.println("\nInsira o numero da sua agencia: ");
		agencia= sc.nextInt();
		
		System.out.println("\nConta: "+numeroConta+"\nAgencia: "+agencia);
		System.out.println("\nInsira o valor do depósito: ");
		deposito= sc.nextFloat();
		conta.depositar(deposito);
		System.out.println("\nSaldo: "+conta.getSaldo());
		
		System.out.println("\nInsira o valor do saque: ");
		saque= sc.nextFloat();
		
		conta.sacar(saque);;
		System.out.println("\nSaldo: "+conta.getSaldo());
	
	}
}
