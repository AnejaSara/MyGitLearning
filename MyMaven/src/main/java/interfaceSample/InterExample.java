package interfaceSample;

public class InterExample implements TestInterface {
	
	public static void printOne() {
		System.out.println("Hello from implementing class");
	}

	public static void main(String[] args) {
		InterExample obj=new InterExample();
		obj.print();
		obj.display();
		printOne();
	}

	@Override
	public void print() {
		System.out.println("Hello from interface 1");
		
		System.out.println("a="+a);
	}

	@Override
	public void display() {
		System.out.println("Hello from interface 2");
	}

}
