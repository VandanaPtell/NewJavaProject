package testprogram;

public class Encapsulation_bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// setting value using para constructor
	//	Bankaccount b1=new Bankaccount("9876asdf","vandana",9876.12);
		// balance is private field we can not add or access it here
			// System.out.println(b1.balance - 1000.00);
		/*System.out.println("accountnumber is " + b1.getaccountnumber());
		System.out.println("accountholder is " + b1.getaccountholder());
		System.out.println("initial_balance is " + b1.getbalance());
		b1.deposit(10);
		System.out.println("updated_balance is " + b1.getbalance());
		*/
		
		// setting value using setter method
		
		Bankaccount b2=new Bankaccount();
		b2.setaccountnumber("1234qwer");
		b2.setaccountholdername("Vandana");
		b2.setbalance(100.0);

		
		System.out.println("accountnumber is " + b2.getaccountnumber());
		System.out.println("accountholder is " + b2.getaccountholder());
		System.out.println("initial_balance is " + b2.getbalance());
		b2.deposit(10);
		System.out.println("updated_balance is " + b2.getbalance());
	}

}
