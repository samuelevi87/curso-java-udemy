package application;

public class BoxUnbox {

	public static void main(String[] args) {

		//Boxing : Leva o valor de uma vari�vel primitiva para a classe. Stack -> Heap
		
		int x = 20;
		Object obj = x;
		System.out.println("Boxing: " + obj);
		
		
		//Unboxing: Leva o valor de uma clase para uma vari�vel primitiva. Heap -> Stack
		
		int y = (int) obj *2;
		
		System.out.println("Unboxing: " +  y);
		
		//Wrapper Class: S�o classes equivalentes aos tipos primitivos, s�o utilizadas para tornar
		//o box e unbox naturais na linguagem Java (Evitar o Casting). Aceitam o valor NULL, ao
		//contr�rio das vari�veis primitivas.
		
//		Byte x; Short y; Integer z; Long a; Float b; Double c; Boolean v; Character d;

		System.out.println("Bom dia"); 
		System.out.println("Boa Tarde"); 
		System.out.println("Boa  noite"); 
		System.out.println("Tchau");
	}

}
