package testprogram;

class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

}

class Dog extends Animal {
	Dog(String name) {
		super(name); // when we have parent and child class in constructor use super keyword
	}

	void bark() {
		System.out.println(name + " is barking");
	}
}

class Cat extends Animal {
	Cat(String name) {
		super(name);
	}

	void meow() {
		System.out.println(name + " is meowing");
	}
}

class Tiger {
	String name;

	Tiger(String name) {
		this.name = name;
	}

	void roar() {
		System.out.println(name + " is roaring");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog("Buddy");
		Cat c = new Cat("Timmy");
		Tiger t = new Tiger("Raja");
		// upcasting means casting of reference from subclass (Dog) type to a superclass
		// (Animal)type
		Animal a = new Dog("Oreo"); // upcasting dog object to animal reference
		a.eat();
		// Downcasting means casting of reference from super class type (Animal) to
		// subclass type (Dog)
		Dog d1 = (Dog) new Animal("Horse"); // Downcasting Animal reference to Dog reference

		d1.eat();
		d.eat();
		d.sleep();
		d.bark();

		c.eat();
		c.sleep();
		c.meow();

		t.roar();
	}

}
