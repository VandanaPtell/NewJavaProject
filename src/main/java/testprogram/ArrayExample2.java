package testprogram;

public class ArrayExample2 {

	public static void main(String[] args) {
		String name[]= {"Vandana","Umang","Zena"};
		for (String n: name) {
			// toUpperCase to change the value from lower to upper case
			System.out.println(n.toUpperCase());
		}
		char c[]= {'a','e','i','o','u'};
		for (char ch:c) {
			System.out.println(ch);
		}
	}

}
 