package exceptionSamples;

public class ArrayIndexExamle {
	
	int array[]= {2,3,4,5};
	
	public void arrayOps() {
		
		int a=10;
		System.out.println("Additon at position 5: "+ (array[5]+a));
	}
	
	

	public static void main(String[] args) {
		ArrayIndexExamle obj=new ArrayIndexExamle();
		obj.arrayOps();

	}

}
