package testprogram;

public class Accessmodifier {
 // accessible anywhere in the project
	public String fieldpublic="This is a public field";
	//accessible only in this class
	private String fieldprivate="This is a private field";
	// accessible within same package + subclasses
	protected String fieldprotected="This is a protected field";
	
	// default access modifier= this will accessible with same package only
	String fielddefault="This is default";
	
	public void publicmethod() {
		System.out.println("This is a public method");
	}
	
	private void privatemethod() {
		System.out.println("This is a private method");
	}
	
	protected void protectedmethod() {
		System.out.println("This is a protected method");
	}
	void defaultmethod() {
		System.out.println("This is a default method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
