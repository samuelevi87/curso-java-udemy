package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("What is the dollar price? "); 
		CurrencyConverter.priceQuotation = sc.nextDouble();
		System.out.print("How many dollars will be bought? "); 
		CurrencyConverter.ammount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: R$ %.2f%n", CurrencyConverter.conversion()); 
		
		
		
		sc.close();
	}

}
