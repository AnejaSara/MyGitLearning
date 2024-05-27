package polymorphism;

public class OffSeason extends OnSeason {

	final float offdis=15f;
	
	@Override
	public float discount(int billAmt) {
		System.out.println("On Season Discount: "+super.discount(billAmt));
		float newtot=0;
		float disper=offdis/100;
		newtot=(billAmt -(disper*billAmt));
		return newtot;
	}
	public static void main(String[] args) {
		int totalBill=4000;
		OffSeason obj=new OffSeason();
		System.out.println("Off Season Discount: "+obj.discount(totalBill));
		
	}

}
