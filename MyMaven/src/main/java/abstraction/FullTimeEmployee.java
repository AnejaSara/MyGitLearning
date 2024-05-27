package abstraction;

public class FullTimeEmployee extends Employee{

	

	public int calculateSalary() {
		int payment = 8 * 25;
		return payment;
	}
	
	@Override
	public int calculateSalary(int hrs) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
public static void main(String[] args) {
		
	FullTimeEmployee obj=new FullTimeEmployee();
	System.out.println("Fll Time salary: "+obj.calculateSalary());
	}

}
