package testprogram;

public class Rectangle {
int length;
int width;
public Rectangle(int l,int w) {
	length=l;
	width=w;
}
public int calculatearea() {
	return length*width;
}
public String myname() {
	return "Vandana";
}
public double area() {
	return 5.1*6.0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1=new Rectangle(5,8);
Rectangle r2=new Rectangle(7,9);
System.out.println(r1.calculatearea());
System.out.println(r2.calculatearea());
System.out.println(r1.myname());
System.out.println(r1.area());

}

}
