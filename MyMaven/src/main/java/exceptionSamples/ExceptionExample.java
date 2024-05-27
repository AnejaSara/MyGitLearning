package exceptionSamples;

public class ExceptionExample {

	public void display() {
		
		int a=10;
		int b=a/0;
		System.out.println("b="+b);
	}
	
	
	public static void main(String[] args) {
		ExceptionExample obj=new ExceptionExample();
		System.out.println("Before exception");
		obj.display();
		System.out.println("After exception");
	}

}
