package oop;

public class AccApp  {
	public static void main(String[] args)
	{
		Loan la = new Loan();
		la.decreaseRate();
		la.increaseRate();
		la.setRate();
		la.setterm(90);
		IRate account0 = new Loan();
		account0.decreaseRate();
	}
}
