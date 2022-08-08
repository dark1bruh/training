package oop;

public class Loan implements IRate{

	@Override
	public void setRate() {

		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {

		System.out.println("Increase");
	}

	@Override
	public void decreaseRate() {

		System.out.println("Decrease");
	}
	public void setterm(int term)
	{
		System.out.println("Setting term to: " + term + "years");
	}

}
