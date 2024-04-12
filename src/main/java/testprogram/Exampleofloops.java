package testprogram;

public class Exampleofloops {
	/*
	 * for (starting point; ending point/condition; increment or decrement) i++;
	 * i=i+i i=i+2
	 * 
	 * Starting point will be outside of your body while(condition) increment or
	 * decrement is part of the body
	 */
	public static void main(String[] args) {
		
		System.out.println("for loop is starting");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
		for (int i = 100; i > 10; i--) {
			System.out.println(i);
		}
		System.out.println("While loop is starting");
		int i = 2;
		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		System.out.println("do while loop is starting");
		int j = 5;
		do {
			System.out.println(j);
			j++;
		} while (j < 50);

	}

}
