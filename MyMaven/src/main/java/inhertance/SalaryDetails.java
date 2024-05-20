package inhertance;

public class SalaryDetails extends OtherSalaryCmponents {
	
	
	public void printSalarySlip() {
		
		System.out.println("Basic pay: "  + basicPay);
		System.out.println("Deduction: "  + deduction);
		System.out.println("Bonus: "  + bonus);
		System.out.println("House Rent Allowance: "+hra);
		System.out.println("Personal Fund: "+pf);
	}

	public static void main(String[] args) {

		SalaryDetails obj=new SalaryDetails();
		double bp=34000f;
		obj.EmployeeBasic(bp, 8000f, 15000f);
		obj.SalaryCmponents(bp);
		obj.printSalarySlip();
	}

}
