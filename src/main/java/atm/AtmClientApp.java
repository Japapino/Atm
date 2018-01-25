package atm;

import java.util.Scanner;

public class AtmClientApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Atm myAccount = new Atm();
		String pin = "1234";
		String enteredPin;

		System.out.println("Enter your pin");
		enteredPin = input.nextLine();

		while (!myAccount.allowAccess(enteredPin)) {
			System.out.println("Invalid access. Try again.");
			enteredPin = input.nextLine();
		}


		System.out.println("Welcome!");
		System.out.println("Please choose an option.");
		System.out.print("Press 1 to deposit funds.\r\n" + "Press 2 to withdraw funds.\r\n"
				+ "Press 3 to check balance.\r\n" + "Press 4 to exit.");
		System.out.println();
		String optionEntered = input.nextLine();
		
		if (optionEntered.equals("1")) {
			System.out.println("How much would you like to deposit? ");
			int depositAmount = input.nextInt(); 
			myAccount.deposit(depositAmount);
			System.out.println("You have deposited " + depositAmount + " to your account and your remaining balance is " +myAccount.getBalance()+".");
					
		}

		if (optionEntered.equals("2")) {
			System.out.println("How much would you like to withdraw?");
			int withdrawlAmount = input.nextInt();
			myAccount.withdraw(withdrawlAmount);
			System.out.println("You have withdrawn " + withdrawlAmount
					+ " from your account and your remaining balance is " + myAccount.getBalance() + ".");
		}
		
		if (optionEntered.equals("3")) {
			System.out.println(myAccount.getBalance());
		}
	}
}
