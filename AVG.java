package dhaiwik;
import java.util.Scanner;

public class AVG 
{
	public static void main(String[]args)
	{
		Scanner sr = new Scanner(System.in);
		int sum = 0,t;
		System.out.print("Enter the Limit:");
		int n = sr.nextInt();
		System.out.println("Enter The Numbers:");
		for(int i = 0 ; i < n ; i++)
		{
			t = sr.nextInt();
			sum += t;
		}
		double avg = sum/n;
		System.out.println("The Average of the Numbers is:"+avg);
		sr.close();
	}
}
