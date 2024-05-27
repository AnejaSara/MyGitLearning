package globalAggregationEmp;

import globalAggregationAddress.AddressClass;

public class EmployeeClass {

	AddressClass address; //reference to address class in different package
	int empid;
	String name;
	String designation;
	
	
	public EmployeeClass(int empid,String name, String designation,AddressClass address )
	{
		this.empid=empid;
		this.name=name;
		this.designation=designation;
		this.address=address; //all the things withing address class is available
		
	}
	
	public void display()
	{
		System.out.println("Empid:"+ empid);
		System.out.println("Name"+name);
		System.out.println("Desognation:"+designation);
		System.out.println("Address"+address.housename);
		System.out.println(address.street);
		System.out.println(address.District);
		System.out.println(address.pin);
	    System.out.println("***************************");
	}	
	
	
	public static void main(String args[]) {
		AddressClass ad1=new AddressClass("houseOne","streetOne","districtOne",678967);
		EmployeeClass em1=new EmployeeClass(101, "Ramu","Manager",ad1);
		AddressClass ad2=new AddressClass("houseTwo","streetTwo","districtTwo",678969);
		EmployeeClass em2=new EmployeeClass(103, "raju","sale Manager",ad2);
		em1.display();
		em2.display();
	}
	
}
