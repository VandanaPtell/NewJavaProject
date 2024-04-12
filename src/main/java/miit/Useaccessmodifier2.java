package miit;

import testprogram.Accessmodifier;

public class Useaccessmodifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Accessmodifier a1=new Accessmodifier();
	Useaccessmodifier2 u=new Useaccessmodifier2();
	
	System.out.println(a1.fieldpublic);
//  System.out.println(a1.fieldprivate); private field so it is not accessible
//  System.out.println(a1.fieldprotected);protected field is not accessible in different package class
//	System.out.println(a1.fielddefault);default field is not accessible in different package class
	
	a1.publicmethod();
//  a1.privatemethod(); this is private method not accessible here
//	a1.protectedmethod();protected method not accessible in different package class
//  a1.defaultmethod();default method not accessible in different package class
		
		}

	}
