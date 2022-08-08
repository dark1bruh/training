package lab;

public class BankAccount implements IInterest {
	//Properties
	
	private String name;
	private String SSN;
	private static final String routingNum = "229400851";
	private String accNum; //- ID + random 2 digits + 2 1st digits of SSN
	private static int ID = 1000;
	private double balance;

	//Constructor
	
	public BankAccount(String SSN, double initDeposit)
	{
		balance = initDeposit;
		System.out.println("-|New account created|-");
		this.SSN = SSN;
		ID++;
		setAccnum();
	}
	
	private void setAccnum()
	{
		int random = (int) (Math.random() * 100);
		accNum = ID + " " + random + " " + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accNum);
		
	}
	
	public void setName (String name)
	{
		this.name = name;
		
	}
	public String getname() {
		
		return name;
	}
	public void withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Withdraw: $" + amount);
		checkBalance();
	}
	
	public void makeDep(double amount)
	{
		balance += amount;
		System.out.println("Your dep: $" + amount);
		checkBalance();
	}
	
	public void checkBalance()
	{
		System.out.println("Your balance: $" + balance);
	}

	@Override
	public void accrue() {

		balance = balance * (1 + rate / 100);
		checkBalance();
	}
	
	public String toString()
	{
		return "[Name: " + name + " | Account number: #" + accNum + " | Routing number: #" + routingNum +
				" | Balance: $" + balance + "]"	;
		
	}
	
	
}
