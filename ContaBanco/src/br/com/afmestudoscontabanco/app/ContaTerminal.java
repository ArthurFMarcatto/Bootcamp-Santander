package br.com.afmestudoscontabanco.app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		int NumeroConta;
		while (true) {
			System.out.println("Por favor, digite o número da Conta: ");
			if (scanner.hasNextInt()) {
				NumeroConta = scanner.nextInt();
				scanner.nextLine();
				break;
			} else {
				System.out.println("Por favor, digite um número válido para o número da Conta.");
				scanner.next();
			}
		}

		System.out.println("Por favor, digite o número da Agência: ");
		String Agencia = scanner.next();

		scanner.nextLine();

		System.out.println("Por favor, digite seu nome completo: ");
		String NomeCliente = scanner.nextLine();

		float Saldo;
		while (true) {
			System.out.println("Por favor, digite seu saldo: ");
			if (scanner.hasNextFloat()) {
				Saldo = scanner.nextFloat();
				break;
			} else {
				System.out.println("Por favor, digite um valor válido para o saldo.");
				scanner.next();
			}
		}

		String saldoFormatado = String.format(Locale.US, "%.2f", Saldo);

		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ Agencia + ", conta " + NumeroConta + " e seu saldo " + saldoFormatado
				+ " já está disponível para saque.");

		scanner.close();
	}
}
