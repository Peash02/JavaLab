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
public class Person
{
	public static void main(String[]args)
	{
		PersonInfo p1 = new PersonInfo("Nobody",(short)15);
		p1.display();
		PersonInfo p2 = new PersonInfo("Somebody",(short)21);
		p2.display();
		PersonInfo p3 = new PersonInfo();
		p3.read();
		p3.display();
		PersonInfo p4 = new PersonInfo();
		p4.read();
		p4.display();
		
	}
}
