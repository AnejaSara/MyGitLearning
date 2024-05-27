package interfaceSample;

public class Hdfc implements RBI{
	
	
	public float recurringDeposit (int amt, int duration) {
		
		float returnAmount = amt * duration * intRate;
		return returnAmount;
	}

	public static void main(String[] args) {
		
		int prAmt=45000, duration=5;
		Hdfc obj=new Hdfc();
		System.out.println("Amount return after deposit: "+obj.recurringDeposit(prAmt, duration));
		
	}

}
