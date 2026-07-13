package com;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
//		System.out.println("Enter the value of a");
//		int a=obj.nextInt();
//		System.out.println("Enter the value of b");
//		int b=obj.nextInt();
//		int sum=a+b;
//		System.out.println("Sum of two numbers is "+sum);
//		obj.close();
//		String name="Steven";
//		System.out.println(name);
		System.out.println("Enter the id");
		int id=obj.nextInt();
		obj.nextLine();   //hold the enter key
		System.out.println("Enter the name");
		//String name=obj.next();    //it takes only one word
		String name=obj.nextLine();  //it takes more than one word till enter key
		System.out.println("Enter the salary");
		float salary=obj.nextFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);

	}

}
