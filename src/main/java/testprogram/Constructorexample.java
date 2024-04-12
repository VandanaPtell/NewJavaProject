package testprogram;

public class Constructorexample {
String brand;
String model;
int year;

public Constructorexample() {
	brand = "Honda";
	model = "Exl";
	year = 2014;
}
public Constructorexample(String Brandname, String modelname,int yr){
	brand = Brandname;
	model = modelname;
	year = yr;
}
public void displaydetails() {
	System.out.println(brand);
	System.out.println(model);
	System.out.println(year);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample c1=new Constructorexample(); 
		Constructorexample c2=new Constructorexample("Kia","forte",2021);
		Constructorexample c3=new Constructorexample("Toyota","atn",2022);
		c1.displaydetails();
		c2.displaydetails();
		c3.displaydetails();
		
	}

}
