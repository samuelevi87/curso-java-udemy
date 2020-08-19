package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		Account z = new BusinessAccount(1052, "Dale", 1000.0, 500.0);

		x.withdraw(50.0);
		y.withdraw(50.0);
		z.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		System.out.println(z.getBalance());

	}

}
