package application;

import java.util.Scanner;

public class ExMatrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Número de linhas: ");
		int m = sc.nextInt();
		System.out.print("Número de colunas: ");
		int n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.print("Digite o nº a procurar: ");
		int proc = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == proc) {
					System.out.println("Position "+ i + "," + j);
					if (j>0) {
						System.out.println("LEFT: " + mat[i][j-1]); 	
					}
					if (i>0) {
						System.out.println("UP: " + mat[i-1][j]); 
					}
					if (j<mat[i].length-1) {
						System.out.println("RIGHT: " + mat[i][j+1]); 
					}
					if (i<mat[i].length-1) {
						System.out.println("DOWN: " + mat[i+1][j]); 
					}

				}
			}
		}
		 
		
		
		
		
		sc.close(); 

	}

}
