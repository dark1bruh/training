package project_test;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		String[] cities =  new String[a];
		
		
		 for(int i = 0; i < a; i++) {  cities[i] = sc.nextLine();
		 
		 } for(int i = 0; i < a; i++) { System.out.println(cities[i]); }
		 
		
	}

}
