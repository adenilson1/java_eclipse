package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();

		System.out.print("Enter account number: ");
		account.AccountNumber(sc.nextInt());
		sc.nextLine();

		System.out.print("Enter account holder: ");
		account.setHolder(sc.nextLine());

		System.out.print("Is there na initial deposit (y/n)? ");
		account.setOp(sc.next().charAt(0));

		if (account.getOp() == 'y') {
			System.out.print("Enter initial deposit value: ");
			account.Deposito(sc.nextDouble());
			System.out.println();
			System.out.println("Account data:");
			account.Print();

			System.out.println();
			System.out.print("Enter a deposit value: ");
			account.Deposito(sc.nextDouble());
			System.out.println("Updated account data:");
			account.Print();

			System.out.println();
			System.out.print("Enter a withdraw value: ");
			account.Withdraw(sc.nextDouble());
			System.out.println("Updated account data:");
			account.Print();
		}
		else {
			System.out.println();
			System.out.println("Account data:");
			account.Print();
			
			System.out.println();
			System.out.print("Enter a deposit value: ");
			account.Deposito(sc.nextDouble());
			System.out.println("Updated account data:");
			account.Print();
			
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			account.Withdraw(sc.nextDouble());
			System.out.println("Updated account data:");
			account.Print();
		}



		sc.close();
	}

}
