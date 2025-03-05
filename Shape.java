package dhaiwik;

import java.util.Scanner;

public class Shape 
{
	final static double pi = 3.14;
	static void calc(double radius)
	{
		double area = pi * radius * radius;
		double perimeter = 2 * pi * radius;
		System.out.print("Area of Circle is " + area + " and the perimeter is " + perimeter + '.');
	}
	static void calc(double length,double width)
	{
		double area = length * width;
		double perimeter = 2 * (length + width);
		System.out.print("Area of Rectangle is " + area + " and the perimeter is " + perimeter + '.');
	}
	static void calc(float side)
	{
		float area = side * side;
		float perimeter = 4 * side;
		System.out.print("Area of Circle is " + area + " and the perimeter is " + perimeter + '.');
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a Shape: \n1.Circle \n2.Square \n3.Rectangle");
		int x = sc.nextInt();
		
		switch(x)
		{
		case 1:
			System.out.print("Enter the Radius of circle:");
			double r = sc.nextDouble();
			calc(r);
			break;
		case 2:
			System.out.print("Enter the Side of Square:");
			float s = sc.nextFloat();
			calc(s);
			break;
		case 3:
			System.out.print("Enter the Length:");
			double l = sc.nextDouble();
			System.out.print("Enter the Breadth:");
			double b = sc.nextDouble();
			calc(l,b);
			break;
		default:
			System.out.print("INVALID CHOICE!!!");
			
		}
	    sc.close();
	}
}
