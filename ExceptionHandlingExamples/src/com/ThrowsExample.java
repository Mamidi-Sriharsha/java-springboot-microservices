package com;

public class ThrowsExample {
    static void dis1() throws Exception{
    	    //try{
    	    	int a=100/0;
    	    //}catch(Exception e) {}
        System.out.println("dis1 method");
    }
    static void dis2() throws Exception{
    	    dis1();
    	    System.out.println("dis2 method");
    	    //try{
    	    	//dis1();
    	    //}catch(Exception e) {}
    }
	public static void main(String[] args) throws Exception{
		//try{
			dis2();
		//}catch(Exception e) {}
		System.out.println("main method");
	}

}
