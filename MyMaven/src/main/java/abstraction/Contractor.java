package abstraction;

public class Contractor extends Employee{

	
	
	public int calculateSalary(int hrs) {
		
		int payment = hrs * 25;
				return payment;
		
	}
	
	
	
	public static void main(String[] args) {
		Contractor obj=new Contractor();
		
		System.out.println("Contractor  salary: "+obj.calculateSalary(45));

	}


	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
