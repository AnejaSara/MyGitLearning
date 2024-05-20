package assignmentMay20;

public class AdditionCheckingClass extends AdditionClass {
	
	public AdditionCheckingClass(int a, int b)
	{
		super(a,b);
	}
	
	
	public  boolean additionCheck(int sum) {
		
		if(sum%10>0) {
		return true;
		}
		else
		{
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		
		AdditionCheckingClass obj=new AdditionCheckingClass(20,30);
		//int sum=obj.addition();
		if(obj.additionCheck(obj.addition())) {
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not Divisible by 10");
		}
	}

}
