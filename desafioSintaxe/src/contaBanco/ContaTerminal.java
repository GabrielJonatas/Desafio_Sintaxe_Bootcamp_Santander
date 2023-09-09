package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nomeCliente;
		
		System.out.println("Digite o número da conta.");

		int numero = scanner.nextInt();
		
		System.out.println("Digite o número da agência.");
		
		String agencia = scanner.next();
		
		scanner.nextLine();
		
		System.out.println("Digite seu nome.");
		
		nomeCliente = scanner.nextLine();
		
		System.out.println("Digite seu saldo.");
		
		double saldo = scanner.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
		
	}

}
