package testprogram;

public class Car {
	int year=2000;
	static String model="Kia";
void start() {
	System.out.println("The car is Starting");
}
void drive() {
	System.out.println("The car is in motion");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//classname objectname = classname();
		//objectname.methodname();
		//objectname.variablename;
		Car c1=new Car();
		c1.start();
		c1.drive();
		

	}

}
