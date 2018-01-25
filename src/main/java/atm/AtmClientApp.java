package atm;

import java.util.Scanner;

public class AtmClientApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Atm myAccount = new Atm(100.00);
		String pin = "1234";
		String enteredPin; 

		System.out.println("Enter your pin");
		enteredPin = input.nextLine(); 
		
		while(!myAccount.allowAccess(enteredPin)) {
			System.out.println("Invalid access. Try again.");
			enteredPin = input.nextLine(); 
		}
		
		System.out.println("Welcome!");
		System.out.println("Please choose an option.");
		System.out.print("Press 1 to deposit funds.\r\n" + 
				"Press 2 to withdrawal funds.\r\n" + 
				"Press 3 to check balance.\r\n" + 
				"Press 4 to exit.");
		String optionEntered = input.nextLine(); 
		
		if (optionEntered.equals("2")) {
			System.out.println("How much would you like to withdraw?"); 
			int withdrawAmount = input.nextInt(); 
			myAccount.withdraw(withdrawAmount);
			System.out.println("You have withdrawn "+withdrawAmount
					+ "and your remaining balance is "+myAccount.getBalance()+".");
			
		}
	}
}
