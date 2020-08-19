package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program4 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			char ch = ' ';
			do {
				System.out.println();
				System.out.println("Product #" + i + " data:");
				System.out.print("Common, used or imported (c/u/i)? ");
				ch = sc.next().charAt(0);
			} while (ch != 'c' && ch != 'u' && ch != 'i');
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch (ch) {
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
				break;
			case 'i':
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
				break;
			case 'c':
				list.add(new Product(name, price));
				break;
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
