package testprogram;

public class Controlstatementexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2000;
		/*
		 * syntax if (condition){} else{}
		 */
		if (x > 0) {
			if (x > 100 && x < 1000) {
				System.out.println("x is between 100 and 1000");
			} else {
				System.out.println("x is not between 100 and 1000");
			}
			System.out.println("x is positive");
		} else if (x < 0) {
			System.out.println("x is negative");
		} else {
			System.out.println("x is zero");
		}
	}

}
