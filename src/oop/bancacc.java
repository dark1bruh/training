package oop;

public class bancacc implements IRate {
	private static final String routingnum = "8888890";
	String accnum;
	private int IBAN;
	private String name;
	 String accType;
	double balance;
	//overload
	//1case
	bancacc()
	{
		System.out.println("NEW ACC CREATED - " );
	}
	//2case
	bancacc(String accType)
	{
		System.out.println("New acc CREATED: " + accType);
	}
	//3case
	bancacc(String accType, double initDep, String iban)
	{
		
		System.out.println("New acc " + accType);
		System.out.println("INITIAL DEP OF $ IS "+ initDep +" | your IBAN: " + iban);
		String Msg = null;
		if(initDep < 1000)
		{
			 Msg = "Deposit is too low";
			System.out.println(Msg);
		}else
		{
			 Msg = "Accepted";
			System.out.println(Msg);
		}
		Msg = "Test";
		System.out.println(Msg);
		balance = initDep;
	}
	
	void dep(double amount)
	{
		balance += amount;
		showactivity("DEPOSIT: ");
	}
	
	void withdraw(double amount)
	{
		balance -= amount;
		showactivity("WITHDRAW: ");
	}
	
	void check()
	{
		
	}
	public String toString()
	{
		return "[ Name: " + name + " | Num of acc: " + accnum  + " | Balance: " + balance + "]";
	}
	private void showactivity(String activity)
	{
		System.out.println("Recent transaction: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	public  void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setiban(int iban)
	{
		this.IBAN = iban;
	}
	public String getiban()
	{
		return "Your iban #" + IBAN;
	}
	
	//interface
	public void setRate()
	{
		System.out.println("Setting rate: ");
	}
	public void increaseRate() {
		System.out.println("Increasing rate: ");
	}
	public void decreaseRate() {
		System.out.println("Decreasing rate: ");
	}
}
