package com;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int []abc;    //array declaration
		int []num= {10,20,30,40,50,60}; //array initialization
		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println("size of array is "+num.length);
		//System.out.println(num[7]);
		System.out.println("retrieve array value using for loop");
		for(int i=0;i<num.length;++i)
			System.out.println(num[i]);
		System.out.println("retrieve elements from array using for each loop");
		for(int n:num) {
			System.out.println(n);
		}
		//creating memory for array
		int num1[]=new int[10];  //like in C or C++ int num1[10];new is a keyword which helps to create dynamic memory
		System.out.println("size of the array "+num1.length);
		System.out.println(num1[0]);
		System.out.println(num1[9]);

	}

}
