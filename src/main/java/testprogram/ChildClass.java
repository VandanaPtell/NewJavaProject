package testprogram;

 class ChildClass extends ParentClass{
	 void display() {
	 
		 super.display(); // super keyword use to call parent class method
	
		 System.out.println("Child class display method");
		
		 super.information();
	 }
 	
 }
