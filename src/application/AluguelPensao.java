package application;

import java.util.Scanner;

import entities.AluguelQuarto;

public class AluguelPensao {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		AluguelQuarto [] quarto = new AluguelQuarto[10];
		
		System.out.print( "Quanta pessoas irão alugar: ");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print( "Qual o seu nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print( "Qual o seu e-mail: ");
			String email = sc.nextLine();
			System.out.print( "Qual o número do quarto que deseja? [0-9]: ");
			int numQuarto = sc.nextInt();
			System.out.println( );
			
			quarto[numQuarto] = new AluguelQuarto(name, email);
			
		}
		
		
//		for (int i = 0; i < quarto.length; i++) {
//			if (quarto[i] != null) {
//				System.out.println( i + ": " + quarto[i].getName() + ", " + quarto[i].getEmail());
//			}
//		
	
//		forEach implementado, se for utilizado o índice do vetor, é necessário 
//		criar uma variável auxiliar para servir de contador.
		
		int index = 0;
		for (AluguelQuarto room : quarto) {
			if (room != null) {
				System.out.println(index + ": " + room.getName() + ", " + room.getEmail());
			}
			index++;
			
		}
		
		sc.close(); 

	}

}
