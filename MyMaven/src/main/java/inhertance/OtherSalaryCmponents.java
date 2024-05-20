package inhertance;

public class OtherSalaryCmponents extends EmployeeBasicSalary{
	
	static double hra;
	static double bp;
	static double pf;
	

	public void SalaryCmponents(double basicpay) {
		
		bp= basicpay;
		hra=0.05f*bp;
		pf=0.20f*bp;
	}
}
