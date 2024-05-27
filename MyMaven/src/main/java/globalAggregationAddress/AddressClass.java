package globalAggregationAddress;

public class AddressClass {
	
	public String housename;
	public String street;
	public String District;
	public int pin;
	
	public AddressClass(String housename,String street,String District,int pin )
	{
		this.housename=housename;
		this.street=street;
		this.District=District;
		this.pin=pin;
	}
	
	public void display() {
		System.out.println("Address"+housename);
		System.out.println(street);
		System.out.println(District);
		System.out.println(pin);
	    System.out.println("***************************");
	}
	

	public static void main(String[] args) {
		

	}

}
