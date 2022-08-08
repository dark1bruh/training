package project_test;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		System.out.println(factorial(a));
	}
	
	public static int factorial(int n)
	{
		if(n == 0)
		{
			return 1;
			
		}else {
		return n * factorial(n - 1);
		}

	}
}
