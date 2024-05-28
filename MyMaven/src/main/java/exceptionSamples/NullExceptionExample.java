package exceptionSamples;

import java.io.IOException;

public class NullExceptionExample {
	
	String str=null;
	public void stringOps() {
		
	
		
		try { 
		int length=str.length();
		System.out.println(length);
		System.out.println("String length: "+str.charAt(1));
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBounds Exception ");
	}
	
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException");
	}
	
	catch(NullPointerException e) {
		System.out.println("NullPointerException");
	}
	catch(Exception e) {
		System.out.println(" New Exception");
	}
	}
	


	public static void main(String[] args) {
		NullExceptionExample obj=new NullExceptionExample();
		obj.stringOps();

	}

}
