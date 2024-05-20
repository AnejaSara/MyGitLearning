package assignmentMay20;

public class AtmParent {
	
	private int pin1=1001, pin2=1234, pin3=1212, accBalanc=10000;
	private int pin, deductAmount;
	
	public void setter(int pin,int deductAmount)
	{
		
		this.pin=pin;
		this.deductAmount=deductAmount;
	}
	
	public void getter()
	{
		if(pin==pin1||pin==pin2||pin==pin3) {
			
			if(deductAmount>accBalanc) {
				System.out.println("Insufficient balance!!!!");
			}
			else
			{
				accBalanc=accBalanc-deductAmount;
				System.out.println("Amount transfer success. Balance Amount: "+accBalanc);
			}
		}
		else
		{
			System.out.println("Wrong Pin number. Please Try again!!!!");
		}
	}

}
