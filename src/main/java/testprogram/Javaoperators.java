package testprogram;

public class Javaoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// arithmatic operators
		System.out.println("***Arithmatic Operators***");
		int addresult = 10 + 5;
		int substractresult = 10 - 5;
		int multiplyresult = 10 * 5;
		int divisionresult = 10 / 5;
		int modulorresult = 10 % 3;
		System.out.println(addresult);
		System.out.println(substractresult);
		System.out.println(multiplyresult);
		System.out.println(divisionresult);
		System.out.println(modulorresult);

		// comparison operator
		System.out.println("***Comparison Operator***");
		int i = 10;
		if (i > 10) {
			System.out.println("Value of i is greater than 10");
			if (i < 10) {
				System.out.println("Value of i is less than 10");
				if (i == 10) {
					System.out.println("Value of i is equal to 10");
				}
				if (i != 10) {
					System.out.println("Value of i is not equal to 10");
				}
				if (i <= 10) {
					System.out.println("Value of i is greater than or equal to 10");
				}
			}
			if (i >= 10) {
				System.out.println("Value of i is less than or equal to 10");
			}
		}
// logical operators
		System.out.println("***Logical Operator***");
		int j=11;
		if (j>1 && j<10) {
			System.out.println("value of j is greater than 1 and less than 10");
		}
		if (j>1 || j<10) {
			System.out.println("value of j is greater than 1 and less than 10");
	}
		if (!(j<10)) {
			System.out.println("value of j is greater than 10");
		}
		int x=5;
	        x++;
	        System.out.println(x);
	    int y=5;
	            y--;
	        System.out.println(y);
	}
	}
