package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Account account = null;
	
		System.out.print("Enter account number: ");
		String accountNumber = leia.next();
		System.out.print("Enter account holder: ");
		String name = leia.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = leia.next().toUpperCase().charAt(0);
		if(response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double value = leia.nextDouble();
			account = new Account(accountNumber, name, value);
		}
		else if(response == 'N') {
			double value = 0;
			account = new Account(accountNumber, name);
		}
		else {
			System.out.print("Enter with a valid option");
		}
		
		System.out.print(account);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = leia.nextDouble();
		account.add(depositValue);
		System.out.print("Updated account data: \n");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = leia.nextDouble();
		account.remove(withdrawValue);
		System.out.print("Updated account data: \n");
		System.out.print(account);

	}

}
