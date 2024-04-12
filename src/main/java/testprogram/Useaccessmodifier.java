package testprogram;

public class Useaccessmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accessmodifier a1=new Accessmodifier();
	System.out.println(a1.fieldpublic);
 // System.out.println(a1.fieldprivate); private field so it is not accessible
	System.out.println(a1.fieldprotected);
	System.out.println(a1.fielddefault);
	
	a1.publicmethod();
 // a1.privatemethod(); this is private method not accessible here
	a1.protectedmethod();
	a1.defaultmethod();
	
	}

}
