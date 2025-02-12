package dhaiwik;
import java.util.Scanner;
import java.lang.Math;

public class Calc 
{
	public static void main(String[]args)
	{
		Scanner sr = new Scanner(System.in);
		System.out.println("1.Perimeter And Area.");
		System.out.println("2.Compound Interest.");
		System.out.println("3.Average.");
		System.out.println("4.Celsius to Fahrenheit.");
		System.out.println("5.Surface Area and Volume of Sphere:");
		System.out.println("6.(X + Y)x Z / X + Y % Z");
		System.out.print("Enter your Choice:");
		int ch = sr.nextInt();
		switch(ch)
		{
		case 1 :	
			System.out.println("Enter the Length:");
			int l = sr.nextInt();
			System.out.println("Enter the Width:");
			int w = sr.nextInt();
		
			int perimeter = 2 * (l + w);
			int area = l * w;
		
			System.out.println("The Perimeter is "+perimeter+" and the area is "+area);
			break;
		case 2 :
			System.out.print("Enter Principal Amount:");
			int P = sr.nextInt();
			System.out.print("Enter Rate of Interest:");
			double R = sr.nextDouble();
			System.out.print("Enter the Time Period:");
			int n = sr.nextInt();
			
			double CI = P * (Math.pow(1 + (R/100),n));
			
			System.out.println("The Compound Interest After "+n+" years is "+CI);
			break;
		case 3 :
			int a[] = new int[20];
			int sum = 0;
			System.out.print("Enter the Limit:");
			n = sr.nextInt();
			System.out.println("Enter The Numbers:");
			for(int i = 0 ; i < n ; i++)
				a[i] = sr.nextInt();
			for(int i = 0 ; i < n ; i++)
				sum = sum + a[i];
			double avg = sum/n;
			System.out.println("The Average of the Numbers is:"+avg);
			break;	 
		case 4 :
			System.out.print("Enter the Temperature in Celsius:");
			double C = sr.nextInt();
			double F = (C *(9/5)+32);
			System.out.println("The Temperature in Fahrenheit is "+F);
			break;
		case 5:
			System.out.print("Enter the radius:");
			double r = sr.nextDouble();
			double sa = 4 * 3.14 * r * r;
			double vol = (4/3) * 3.14 * (r * r * r);
			System.out.println("The Surace Area is "+sa+" and the Volume is "+vol);
		case 6 :
			int x,y,z;
			System.out.print("Enter x,y and z:");
			x = sr.nextInt();
			y = sr.nextInt();
			z = sr.nextInt();
			double result = (x + y) * z / x + y % z;
			System.out.println("The result is "+result);
			sr.close();
			
		}
	}
	

}
