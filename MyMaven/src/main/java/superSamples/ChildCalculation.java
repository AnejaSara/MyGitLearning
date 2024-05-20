package superSamples;



public class ChildCalculation extends parentCalulation {
	
	
	public ChildCalculation() {
		super(50,30);
		int a=10;
		int b=12;
		System.out.println("Multiplication: "+(a*b));
		
		
	}
	
public ChildCalculation(int c, int d) {
		
		this();
		System.out.println("Division: "+(c/d));
	}
	
public static void main(String[] args) {
	
	ChildCalculation obj=new ChildCalculation(300,15);
	//System.out.println("Hi");
	
	
}

}
