package testprogram;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
int a=s.nextInt();

System.out.println("Enter the second number");
int b=s.nextInt();

int sum= a+b;
System.out.println("sum of a and b is " +sum);
	}

}
