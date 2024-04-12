package testprogram;

public class Bankaccount {
 //  all private variables or fields
	private String accountnumber;
	private String accountholder;
	private double balance;
	
	// parameterized constructor
	/*public Bankaccount(String accountnumber,String accountholder, double balance) {
		this.accountnumber=accountnumber;
		this.accountholder=accountholder;
		this.balance=balance;
	}*/
	
	// setter method
	
	public void setaccountnumber(String accountnumber) {
		this.accountnumber=accountnumber;
		
	}
	
	public void setaccountholdername(String accountholder) {
		this.accountholder=accountholder;
		
	}
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	// getter methods
	public String getaccountnumber() {
		return accountnumber;
		
	}
	public String getaccountholder() {
		return accountholder;
	}
	public double getbalance() {
		return balance;
	}
	// method to deposit money
	public void deposit(double amount) {
		if (amount>0) {
			balance=balance+amount;
			System.out.println(amount + "$ deposited successfully");
		}
		else {
			System.out.println("invalid amount value");
		}
		
	}
	
}
