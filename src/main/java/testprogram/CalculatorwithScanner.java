package testprogram;

import java.util.Scanner;

public class CalculatorwithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter a first number");
int a = s.nextInt();

System.out.println("Enter an operator");
String operator = s.next(); // for string use next

System.out.println("Enter the second number");
int b = s.nextInt();
int result=0;

if (operator.equals("+")) {
	result = a+b;
}
else if(operator.equals("-")){
	result = a-b;
}
else if(operator.equals ("*")){
	result = a*b;
	}
else if(operator.equals ("/")){
	result = a/b;
	}

else {
	System.out.println("Invalid operator");
	System.exit(0);
	}
System.out.println(result);

s.close();
}


}
