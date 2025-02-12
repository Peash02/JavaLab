package dhaiwik;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Boolean prime = true;
		
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		
		for(int i = 2; i < n/2; i++)
		{
			if(n % i == 0)
				prime = false;
		}
		if(prime)
			System.out.print(n + " is a Prime Number.");
		else
			System.out.print(n + " is not a Prime Number.");
		sc.close();
		
		
	}
}
