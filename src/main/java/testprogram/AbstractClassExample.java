package testprogram;

//abstract class may or may not have abstract method but if class have a abstract method class should declared as a abstract
abstract class Shape {
	abstract double CalculateArea(); // abstract method means method without a body

	String color;

	void selectColor(String color) { // concrete method means method with a body
		this.color = color;
	}

	void display() {
		System.out.println("This is a " + color);
	}
}

class Circle1 extends Shape {
	double radius;

	Circle1(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}

	double CalculateArea() {
		return Math.PI * radius * radius;
	}
}

class Square extends Shape {
	double Side;

	Square(String color, double side) {
		this.color = color;
		this.Side = side;
	}

	double CalculateArea() {
		return Side * Side;
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		Circle1 c = new Circle1("red", 5.5);
		Square s = new Square("blue", 6.6);
		System.out.println("Area of a circle" + c.CalculateArea());
		System.out.println("Area of a square" + s.CalculateArea());
	}

}
