package com;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;   //-128 to 127
		short b=a;   //implicit type casting
		 
		short c=10;
		byte d=(byte)c;  //explicit type casting
		
		long l=9876543210l;//explicit type casting
		int m=(int)l;     //explicit type casting
        float f=10.0f;  //explicit type casting bcoz by default double
        float f1=10;   //implicit type casting

	}

}
