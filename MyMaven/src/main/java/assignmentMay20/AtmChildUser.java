package assignmentMay20;

public class AtmChildUser {

	public static void main(String[] args) {
		
		int atmPin=2001, deductAmount=2000;
		AtmParent obj=new AtmParent();
		obj.setter(atmPin,deductAmount);
		obj.getter();
		
		System.out.println("Print");
	}

}
