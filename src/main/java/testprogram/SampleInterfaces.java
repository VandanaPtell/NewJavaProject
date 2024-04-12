package testprogram;

// interface cannot have a concrete/normal method
interface SoundMaker {
	abstract void makeSound(); // method without body

	abstract void display();
}

interface Mover {
	abstract void move();
}

//we can extend only one class but we can implement multiple interface
// if we implement interface we need to implement all methods of that interface
class Children implements SoundMaker, Mover {
	public void makeSound() {
		System.out.println("Children are shouting");
	}

	public void display() {

	}

	public void move() {
		System.out.println("Children are playing");
	}
}

public class SampleInterfaces {

	public static void main(String[] args) {
		Children c = new Children();
		c.makeSound();
		c.move();

	}

}
