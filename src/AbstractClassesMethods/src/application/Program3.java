package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contributor;
import entities.LegalPerson;
import entities.PhisicalPerson;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contributor> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();

		for (int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = ' ';
			do {
				ch = sc.next().charAt(0);
			} while (ch != 'c' && ch != 'i');
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual Income: $ ");
			double annualIncome = sc.nextDouble();
			switch (ch) {
			case 'i':
				System.out.print("Health Expenses: $ ");
				double healthExpenses = sc.nextDouble();
				list.add(new PhisicalPerson(name, annualIncome, healthExpenses));
				break;
			case 'c':
				System.out.print("Number of Employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, numberEmployee));
			default:
				break;
			}

		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contributor con : list) {
			double tax = con.tax();
			System.out.println(con.getName() + " $ " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
