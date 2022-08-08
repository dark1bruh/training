package lab;
import java.util.*;

public class Sdata_output {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name that we could create an e-mail for you: ");
		
		String ssn = "2976524332";
		String name = sc.nextLine();
		name = name.toLowerCase();
		
		
		
		Student st1 = new Student(name, ssn);
		st1.enroll("Physicks");
		st1.enroll("Math");
		st1.checkBalance();
		st1.showPrice();
		System.out.println(st1.toString());
		
		
	}

}
