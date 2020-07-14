package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Array;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		System.out.print( "Digite o número de leituras: ");
		int n = sc.nextInt();
		Product_Array [] vect = new Product_Array [n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print( "Digite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print( "Digite o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product_Array(name, price);
		}
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.println( "Média: R$ " + String.format("%.2f", avg));
		
		
		sc.close();
	}

}
