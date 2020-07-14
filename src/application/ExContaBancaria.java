package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class ExContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		ContaBanco cc;
		
		System.out.print("Insira o número da conta : 8532\n");
		int numero = 8532;
		System.out.print( "Nome do titular: Alex Green\n");
//		sc.nextLine();
		String titular = "Alex Green";
		System.out.print( "Será feito um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
		System.out.print( "Insira o valor do depósito inicial: ");
		double depositoInicial = sc.nextDouble();
		cc = new ContaBanco(numero, titular, depositoInicial);
		}
		else {
		cc = new ContaBanco(numero, titular);
		}
	
		System.out.println("\nDados da conta: " + cc);
		System.out.print( "Insira o valor do Depósito: ");
		double valor = sc.nextDouble();
		cc.deposito(valor);
		System.out.println("\rDados atualizados da conta: " + cc);	
		System.out.print( "Insira o valor do Saque: ");
		valor = sc.nextDouble();
		cc.saque(valor);
		System.out.println("\rDados atualizados da conta: " + cc);	
		
		
		
		sc.close(); 

	}

}
