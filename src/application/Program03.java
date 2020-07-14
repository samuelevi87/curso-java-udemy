package application;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		
		System.out.print( "Digite o n�mero de leituras: ");
		int n = sc.nextInt();
		double [] vect = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print( "Digite a " + (i+1) + "� altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for (int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
	 System.out.print( "A m�dia das alturas digitadas �: " + String.format("%.2f", avg));
		
		sc.close(); 

	}

}
