package abstraction;

public class DebugExample {
	
	
	public void loophere()
	{
		
		for(int i=0; i<5; i++) {
			
			System.out.println(i);
		}
	}
	
	
	public void print() {
		System.out.println("step into");
	}

	public static void main(String[] args) {
		
		DebugExample obj=new DebugExample();
		System.out.println("before debug");
		obj.loophere();
		obj.print();
		
	}

}
