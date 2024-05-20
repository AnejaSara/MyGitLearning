package encapsulation2;

import encapsulation1.EncapClass;

public class User {

	public static void main(String[] args) {
		
		EncapClass obj=new EncapClass();  /// aggregation - HAS A relationship
		obj.setter("Java", 30);
		obj.getter();

	}

	
}
