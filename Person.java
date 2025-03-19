package dhaiwik;
import java.util.Scanner;
class PersonInfo
{
	String name;
	short age;
	
	public PersonInfo()
	{
		name ="";
		age = 0;
	}
	public PersonInfo(String n , short a)
	{
		name = n;
		age = a;
	}
	public void display()
	{
		System.out.println(name+" is " + age + " years old.");
	}
	public void read()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Name:");
		name = s.next();
		System.out.print("Enter the Age:");
		age = s.nextShort();
	}
}
class Student extends PersonInfo
{
	int regno;
	double m1,m2,m3,total,avg;
	String result;
	
	public void getDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter RegNo. :");
		regno = s.nextInt();
		System.out.print("Enter the Marks in 3 Subjects:");
		m1 = s.nextDouble();
		m2 = s.nextDouble();
		m3 = s.nextDouble();
	}
	public void calcresult()
	{
		total = m1 + m2 + m3;
		avg = total / 3.0;
		if (avg>80)
			result = "Distinction";
		else if (avg > 60)
			result = "First Class";
		else if (avg > 40)
			result = "Second Class";
		else if (avg >= 30)
			result = "Third Class";
		else if ( avg < 30)
			result = "Fail";
	}
	public void displayresult()
	{
		System.out.print(" \t| " + name);
		System.out.print(" \t| " + age);
		System.out.print(" \t| " + regno);
		System.out.print(" \t| " + m1);
		System.out.print(" \t| " + m2);
		System.out.print(" \t| " + m3);
		System.out.print(" \t| " + total);
		System.out.print(" \t| " + avg);
		System.out.println(" \t| " + result);
		
	}
}

public class Person
{
	public static void main(String[]args)
	{
		Student[] s = new Student[100];
		int n;
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter the Total Number of Student:");
		n = sr.nextInt();
		for (int i = 0 ; i < n ; i ++)
		{
			s[i] = new Student();
			s[i].read();
			s[i].getDetails();
			s[i].calcresult();
		}
		System.out.println("\t____________________________________________________________________________");
		System.out.println("\t| Name \t| Age \t|Reg No\t| M1 \t| M2 \t| M3 \t| Total\t\t| Avg \t| Result |");
		System.out.println("\t____________________________________________________________________________");
		
		for ( int i = 0 ; i < n ; i ++)
			s[i].displayresult();
		System.out.println("\t____________________________________________________________________________");
	}
}
