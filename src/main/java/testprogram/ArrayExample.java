package testprogram;

public class ArrayExample {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;

		int[] number = { 1, 2, 3, 7, 9, 0, 9, 0 };
		System.out.println("element of array traditional for loop");
		// traditional for loop
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("element of array using enhance for loop");

		// enhance for loop or foreach loop
		for (int i : number) {
			System.out.println(i);
		}
		System.out.println(number[3]);

	}

}
