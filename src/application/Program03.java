package application;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		
		System.out.print( "Digite o número de leituras: ");
		int n = sc.nextInt();
		double [] vect = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print( "Digite a " + (i+1) + "ª altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for (int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
	 System.out.print( "A média das alturas digitadas é: " + String.format("%.2f", avg));
		
		sc.close(); 

	}

}
