package lab;

public class BankAccountApp {
	public static void main (String[] args)
	{
		
		BankAccount acc0 = new BankAccount("123009584", 1000.7);
		BankAccount acc1 = new BankAccount("529853880", 2000);
		BankAccount acc2 = new BankAccount("902502973", 3000);
		
		acc0.setName("Joe");
		System.out.println(acc0.getname());
		acc0.makeDep(789);
		acc0.makeDep(15.9);
		acc0.withdraw(93.3);
		acc0.accrue();
		System.out.println(acc0.toString());
		
	}

}
