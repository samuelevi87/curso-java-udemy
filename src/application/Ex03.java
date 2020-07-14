package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		Student aluno = new Student();
		
		System.out.println("Exercício 03\r"); 
		System.out.print("Nome: "); 
		aluno.name = sc.nextLine();
		System.out.print("Notas: "); 
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno.resultado());
		
		
		
		
		
		sc.close();
	}

}
