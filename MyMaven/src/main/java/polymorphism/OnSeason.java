package polymorphism;

public class OnSeason {
	
	final float ondis=40f;
	
	public float discount(int billAmt) {
		float newtot=0;
		float disper=ondis/100;
		newtot=(billAmt -(disper*billAmt));
		return newtot;
	}

}
