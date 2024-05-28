package exceptionSamples;

public class ThrowExceptionExample {
	
	
	public void voteElig(int age) {
		
		if(age<18) {
			throw new ArithmeticException("condition wrong < than 18");
		}
		else
		{
			System.out.println("Eligilble for voting");
		}
	}

	public static void main(String[] args) {
	
		ThrowExceptionExample obj=new ThrowExceptionExample();
		obj.voteElig(12);
	}

}
