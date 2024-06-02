package br.com.afmestudoscontrolefluxo.app;

import java.util.Scanner;

import br.com.afmestudoscontrolefluxo.Exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int parametroUm, parametroDois;

		try {
			while (true) {
				System.out.println("Digite o primeiro parâmetro:");
				if (sc.hasNextInt()) {
					parametroUm = sc.nextInt();
					sc.nextLine();
					break;
				} else {
					System.out.println("Por favor, digite um número válido para o primeiro valor.");
					sc.next();
				}
			}

			while (true) {
				System.out.println("Digite o segundo parâmetro:");
				if (sc.hasNextInt()) {
					parametroDois = sc.nextInt();
					sc.nextLine();
					break;
				} else {
					System.out.println("Por favor, digite um número válido para o segundo valor.");
					sc.next();
				}
			}

			try {
				contar(parametroUm, parametroDois);

			} catch (ParametrosInvalidosException exception) {
				exception.printStackTrace();
			}
		} finally {
			sc.close();
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
