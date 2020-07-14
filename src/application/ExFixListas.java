package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee_;

public class ExFixListas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		List <Employee_> list = new ArrayList<>();


		
		//Parte 01 - Cadastrando os funcionários
		System.out.print("How many employess wil be registered:  ");
		int qtd = sc.nextInt();
		
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("\nEmployee # " + (i + 1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			//Verificando se o ID já não foi cadastrado antes.
			while (hasId(list, id)) {
				System.out.println("ID already taken! Try Again!");
				System.out.print("ID: ");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee_ emp = new Employee_(id, name, salary); //Instanciando a classe
			list.add(emp); //Adicionando na lista
		}
		//Parte 02 - Adicionando o aumento de Salário.
		System.out.println("\nEnter the employee ID that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Employee_ emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
//		Integer pos = position(list, idsalary);
		if (emp == null) {
			System.out.print("This Id does not exist!\n");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println("\nList of Employees: ");
		for (Employee_ e : list) {
			System.out.println(e);
		}
	
		sc.close();
	}
	
	public static Integer position (List<Employee_> list, int id) {
		  for (int i = 0; i < list.size(); i++) {
			  if (list.get(i).getId() == id) {
				  return i;
			  }
		  }
		  return null;
	}
	
	public static boolean hasId (List<Employee_> list, int id) {
		Employee_ emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
