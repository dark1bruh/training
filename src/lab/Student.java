package lab;


public class Student {
	
		private String name;
		private String SSN;
		private String st_id;
		private String course = "";
		private String email;
		private String phone;
		private String city;
		private String state;
		private static final int cost = 666;
		private static int ID = 100;
		private int balance = 80000;
		private int amount;
		
		
		
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Student(String name, String SSN)
		{
			ID++;
			this.name = name;
			this.SSN = SSN;
			System.out.println("Your account created: ");
			set_mail(name);
			System.out.println("Personal user ID: ");
			setID();
			System.out.println("Cost of the course is: 666$");
			
			
		}
	
	public void set_mail(String name)
	{
		
		int random = (int) (Math.random() * 1000);
		this.email = name + random + "@gmail.com";	
		System.out.println(this.email);
	}
	
	public void setID()
	{
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min));
		
		st_id = ID + " " + random + " " + SSN.substring(0, 4) ;
		System.out.println(st_id);
	}
	
	public void enroll(String course)
	{
		this.course = this.course + " " + course; 
		pay();
		System.out.println("You enrolled course: " + course);
	}
	
	public void pay()
	{
		this.balance -= this.cost; 
		amount += cost;
		
		
		
		
	}
	public void showPrice()
	{
		System.out.println("Overal price is: $" + amount);
	}
	
	public void checkBalance()
	{
		
		System.out.println( "Your balance now: $" + balance);
	}
	
	public String toString()
	{
		return "[NAME: " + name + "]\n[COURSES: " + course + "]\n[BALANCE: $" + balance + "]";
		
	}
	
	
	
}


