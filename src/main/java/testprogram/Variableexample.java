package testprogram;
	/*
	 * local variable -> created inside a method
	 * instance variable
	 * static variable
	 */
	public class Variableexample{
			int n=10; //instance variable
			int b=5;
			static int v=6;
			void printNumbers() {
				int n=10;
			System.out.println(n);
		}
		void sumnumbers() {
			int n=20; //local variable
			int m=10;
			int p=n+m;
			System.out.println(p);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variableexample v1=new Variableexample();
		v1.printNumbers();
		v1.sumnumbers();
		System.out.println(v1.n); //calling instance variable
		System.out.println(v1.b);
		System.out.println(Variableexample.v);
	System.out.println(Variableexample2.staticvar);
	// System.out.println(Variableexample2.instancevar);Can't access instance variable using class name need to create object
	
	Variableexample2 v2=new Variableexample2();
	System.out.println(v2.instancevar);
	}
	}

