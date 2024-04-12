package testprogram;

public class Carconstructor {
String brand;
String model;
int year;
double price;
//default constructor 
public Carconstructor() {
	brand="unknown";
	model="unknown";
	year=0;
	price=0.0;
}
// parameterized constructor with 4 parameter

public Carconstructor(String brand, String model, int year, double price) {
	this.brand=brand;
	this.model=model;
	this.year=year;
	this.price=price;
}
//parameterized constructor with 3 parameter

public Carconstructor(String brand, String model, int year) {
	this.brand=brand;
	this.model=model;
	this.year=year;
	
}
public Carconstructor(String brand, String model) {
	this.brand=brand;
	this.model=model;
	
}
// copy constructor
public Carconstructor(Carconstructor othercar) {
	brand=othercar.brand;
	model=othercar.model;
	year=othercar.year;
	price=othercar.price;
}
// methods to display car details

public void displaydetail() {
	System.out.println("brand is" + brand);
	System.out.println("model is" + model);
	System.out.println("year is" + year);
	System.out.println("price is" + price);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Carconstructor c1=new Carconstructor();
Carconstructor c2=new Carconstructor("honda","civic",2012,21000.00);
Carconstructor c3=new Carconstructor("toyota","rav4");
Carconstructor c5=new Carconstructor(c3);
System.out.println("displaying c1 data");
c1.displaydetail();
System.out.println("displaying c2 data");
c2.displaydetail();
System.out.println("displaying c3 data");
c3.displaydetail();
// copy constructor display
System.out.println("displaying c5 data");
c5.displaydetail();
	}

}
