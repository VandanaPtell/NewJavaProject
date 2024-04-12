package testprogram;

public class MethodOverloading {
	// method with two int parameter
	int add (int a, int b) {
		return a+b;
	}
	// method with three int parameters
	int add (int a, int b, int c) {
		return a+b+c;
	}
	// method with two double parameters
	double add (double a, double b) {
		return a+b;
	}
	// method with int and double parameter 
	double add (int a, double b) {
		return a+b;
	}
	
	double add(double a, int b) {
		return a+b; // or return (a+b);
	}
	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		System.out.println(m.add(5, 10));
		System.out.println(m.add(5, 10, 8));
		System.out.println(m.add(10.5, 10.5));
		System.out.println(m.add(5, 10.5));
		System.out.println(m.add(5.5, 10));

	}

}
