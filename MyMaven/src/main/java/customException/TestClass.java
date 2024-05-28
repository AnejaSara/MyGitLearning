package customException;

public class TestClass {
	
	public void eligible(int age) throws LiscenseException {
		 if(age>=18) {
			 System.out.println("Eligible for liscence");
		 }
		 else {
			 throw new LiscenseException("not eligible");
		 }
	}

	public static void main(String[] args)  {
		TestClass obj=new TestClass();
		try {
			obj.eligible(12);
		} catch (LiscenseException e) {
		
			e.printStackTrace();
		}
		System.out.println("after the throw");

	}

}
