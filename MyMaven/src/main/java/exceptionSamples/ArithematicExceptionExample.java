package exceptionSamples;

public class ArithematicExceptionExample {

	public void display() {
		
		int a=10;
		try {
		int b=a/0;
		System.out.println("b="+b);
		}
		/*catch(Exception e) {
			System.out.println(" exception handled");
			System.out.println(e);
		}*/
		finally {
			System.out.println("finally block");
		}
	}
	
	
	public static void main(String[] args) {
		ArithematicExceptionExample obj=new ArithematicExceptionExample();
		System.out.println("Before exception");
		obj.display();
		System.out.println("After exception");
	}

}
