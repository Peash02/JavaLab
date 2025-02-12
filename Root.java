package dhaiwik;
import java.util.Scanner;
import java.lang.Math;

public class Root 
{
	public static void main(String[]args)
	{
		double r1,r2;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Coefficients:");
		int a = ob.nextInt();
		int b = ob.nextInt();
		int c = ob.nextInt();
		
		double D = (b*b)-(4*a*c);
		if(D > 0)
		{
			System.out.println("The Roots are Distinct and Real.");
			r1 = (-b + Math.sqrt(D))/(2*a);
			r2 = (-b - Math.sqrt(D))/(2*a);
			System.out.println("The Roots are " + r1 + " and " + r2);
			
		}
		else if(D < 0)
		{
			System.out.println("The Roots are Imaginary.");
			r1 = (-b/(2*a));
			r2 = (Math.sqrt(-D)/(2*a));
			System.out.println("The Roots are " + r1+"+i"+r2 + " and " + r1+"-i"+r2);
			
		
		}
		else
		{
			System.out.println("The Roots are Equal and Real.");
			r1 = (-b + Math.sqrt(D))/(2*a);
			r2 = r1;
			System.out.println("The Roots are " + r1 + " and " + r2);
		}
		ob.close();
		
	}
}
