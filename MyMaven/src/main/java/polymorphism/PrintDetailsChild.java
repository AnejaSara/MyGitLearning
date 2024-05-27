package polymorphism;

public class PrintDetailsChild extends PrintDetailsParent {

	
	public void display()
	{
		super.display();
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		
		PrintDetailsChild obj=new PrintDetailsChild();
		obj.display();
		
	}

}
