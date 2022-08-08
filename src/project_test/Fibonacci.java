package project_test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the Fibbonaci num you want to find: ");
		a = sc.nextInt();
		System.out.println(fib(a));
	}
	
	public static int fib(int n)
	{
		switch(n)
		{
		case 0:
			return 0;
		case 1:
			return 1;
			default:
				return fib(n - 1) + fib(n - 2);
		}
		/*
		 * if(n == 0) { return 0;
		 * 
		 * } else if(n == 1) { return 1; }
		 * 
		 * return fib(n - 1) + fib(n - 2);
		 */
		
	}
}
