package testprogram;

public class MethodOverridingExample {

	public static void main(String[] args) {
 
		Vehicle v = new Vehicle();
		Vehicle v1 = new Car1();
		Car1 c = new Car1();
		
		v1.makesound();
		v1.wheels(2, 4);
		v.makesound();
		v.wheels(4, 8);
		c.makesound();
		c.wheels(2, 3);
	}

}
