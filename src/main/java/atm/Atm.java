package atm;

public class Atm {
	private double balance; 
	private String requiredPin = "1234"; 

	public double getBalance() {
		return balance; 
	}
	
	public Atm() {
		this(500.00); 
		//can also do
		//balance = 500.00
		//calling other constructor
	}
	public Atm(double amount) {
		// TODO Auto-generated constructor stub
		balance = amount; 
	}

	public void withdraw(int amountToWithdraw) {
		// TODO Auto-generated method stub
		balance-=amountToWithdraw; 
		
	}

	public boolean allowAccess(String enteredPin) {
		// TODO Auto-generated method stub
		return enteredPin.equals(requiredPin);
	}

}
