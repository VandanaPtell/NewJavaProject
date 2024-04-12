package testprogram;

public class Variableexample2 {
static int staticvar=0; // static variable
int instancevar; // instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Initial value of static variable " + staticvar);

Variableexample2 v1= new Variableexample2();
Variableexample2 v2 = new Variableexample2();
v1.instancevar=10;
v2.instancevar=20;
	System.out.println("value of v1's object:" + v1.instancevar);
	System.out.println("value of v2's object:" + v2.instancevar);
//	instancevariable=5; Instance variables can not called without object
	staticvar=5;
	System.out.println("updated value of staticvar:" + staticvar);
	
	examplestaticmethod();
	v1.instanceexamplemethod();
//  instanceexamplemethod(); Instance method can not called without object
	}
public static void examplestaticmethod() {
//  static method is accessible in static & non static (instance) method but non static or instance method can not be created without object 
	int a=5;
	int b=10;
	int sum=a+b;
	System.out.println(sum);
//  System.out.println(instancevar); non static or instance method can not be created without object 
	System.out.println(staticvar);
}
public void instanceexamplemethod() {
	int a=5;
	int b=10;
	int multiply=a*b;
	System.out.println(multiply);
	System.out.println(instancevar);
	System.out.println(staticvar);
}

}

