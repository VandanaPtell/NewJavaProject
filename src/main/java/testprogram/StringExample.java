package testprogram;

public class StringExample {

	public static void main(String[] args) {
		String firstName = "Vandana";
		String lastName = "Ptell";
		String fullName = firstName + lastName; // concatenation of string
		int length = fullName.length(); // get length of the string
		char firstChar = firstName.charAt(0); // accessing of a character in a string
		String sub = fullName.substring(2, 4); // get as substring from a string
		boolean isEqual = firstName.equals(lastName);
		boolean isEqual1 = firstName.equalsIgnoreCase(lastName); // string comparison
		String uppercase = fullName.toUpperCase(); // convert to uppercase
		String lowercase = fullName.toLowerCase(); // convert to lowercase
		boolean contains = fullName.contains("na"); // checking if string contains
		String course = "IT course";
		String[] courseArray = course.split(" "); // splitting a string by space
		System.out.println(fullName);
		System.out.println(length);
		System.out.println(firstChar);
		System.out.println(sub);
		System.out.println(isEqual);
		System.out.println(isEqual);
		System.out.println(uppercase);
		System.out.println(lowercase);
		System.out.println(contains);
		System.out.println(courseArray[0]);
		System.out.println(courseArray[1]);

	}

}
