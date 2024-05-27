package globalAggregationEmp;

import globalAggregationAddress.AddressClass;

public class StudentClass {

	int rollno;
	String name;
	AddressClass add;
	
	StudentClass(int rollno,String name,AddressClass add)
	{
		this.rollno=rollno;
		this.name=name;
		this.add=add;
	}
	
	public void display() {
		System.out.println("Roll No:"+ rollno);
		System.out.println("Name"+name);
		/*System.out.println("Address"+add.housename);
		System.out.println(add.street);
		System.out.println(add.District);
		System.out.println(add.pin);
	    System.out.println("***************************");*/
	}
	
	
	public static void main(String[] args) {
		AddressClass ad1=new AddressClass("houseOne","streetOne","districtOne",678967);
		StudentClass sc1=new StudentClass(101,"Ramu",ad1);
		AddressClass ad2=new AddressClass("houseTwo","streetTwo","districtTwo",678967);
		StudentClass sc2=new StudentClass(101,"Ramu",ad1);
		sc1.display();
		ad1.display();
		sc2.display();
		ad2.display();
		
	}

}
