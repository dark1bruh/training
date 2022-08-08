package oop;
import java.util.*;

public class bancaccapp {

		public static void main(String[] args)
		{
			//acc0
			Scanner sc = new Scanner(System.in);
			bancacc acc0 = new bancacc();
			acc0.accnum = "24597354-92";
			//acc0.name = "Roger";
			String nam = sc.nextLine();
			acc0.setname(nam);
			acc0.balance = 931440.24;
			acc0.dep(4212);
			acc0.dep(904);
			acc0.withdraw(7543);
			acc0.setiban(245);
			System.out.println(acc0.getiban());
			System.out.println(acc0.toString());
			acc0.increaseRate();
			
			//acc1
			bancacc acc1 = new bancacc("Checking");
			acc1.accnum = "09357890";
			nam = sc.nextLine();
			acc1.setname(nam);
			System.out.println(acc1.getname());

			System.out.println(acc1.getname());
			System.out.println(acc1.toString());
			//acc2
			
			bancacc acc2 = new bancacc("Savings ", 20 , "wfwfwfwfw");
			acc2.accnum = "059237892";
			acc2.check();
			
			//cdacc
			CDacc cd0 = new CDacc();
			cd0.balance = 60000;
			nam = sc.nextLine();
			cd0.setname(nam);
			System.out.println(cd0.getname());

			cd0.accnum = "000000";
			cd0.interestrate = "4.7";
			cd0.compount();
			
			System.out.println(cd0.toString());
			
			//intereface
			
		}
		
}
