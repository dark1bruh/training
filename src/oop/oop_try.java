package oop;


class person
{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println(name + " is walking");
	}
	
	void speak()
	{
		System.out.println(name + " is speaking");
	}
	
	void run()
	{
		System.out.println(name + " is running");
	}
	
	void fuck()
	{
		System.out.println(name + " is fucking");
	}
	
	void e_m()
	{
		System.out.println(email);
	}
}
public class oop_try {
	
	public static void main(String[] args)
	{
		
		person person1 = new person();
		person1.name = "hui";
		person1.email = "hui@gmail.com";
		person1.phone = "+3800000000000";
		person1.fuck();
		person1.run();
		person1.speak();
		person1.walk();
		person1.e_m();
		
		
		/*
		 * //Descriptors String name = "Lisa"; String email = "kukuha@gmail.com"; String
		 * phone = "+38066666666"; String name2 = "Andrii"; String email2 =
		 * "qwer@gmail.com"; String phone2 = "+38011111111111";
		 * 
		 * walking(name); speaking(name); running(name); fucking(name); walking(name2);
		 * speaking(name2); running(name2); fucking(name2);
		 */
		/*
		 * //Actions System.out.println(name + " Is walking"); System.out.println(name +
		 * " Is running"); System.out.println(name + " Is speaking");
		 * System.out.println(name + " Is fucking");
		 */
		
		//Description
		
		/*
		 * //Actions System.out.println(name2 + " Is walking");
		 * System.out.println(name2+ " Is running"); System.out.println(name2+
		 * " Is speaking"); System.out.println(name2+ " Is fucking");
		 */
	}
	static void walking(String name)
	{
		System.out.println(name + " is walking");
	}
	
	static void running(String name)
	{
		System.out.println(name + " is running");
	}
	
	static void speaking(String name)
	{
		System.out.println(name + " is speaking");
	}
	
	static void fucking(String name)
	{
		System.out.println(name + " is fucking");
	}
}
