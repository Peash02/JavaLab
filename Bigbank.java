package dhaiwik;

class bankacc 
{
	private int balance = 1000;
	public synchronized void withdraw(int amount , String name)
	{
		while( balance < amount)
		{
			System.out.println(name + " is waiting to withdraw " + amount + " due to insufficient balance.");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		balance -= amount;
		System.out.println(name + " succesfully withdrew " + amount + ".Remaining balance: " + balance);
	}
	public synchronized void deposit(int amount , String name)
	{
		balance += amount;
		System.out.println(name + " deposited " + amount + ".Updated Balance: " + balance);
		notifyAll();
	}
}
class Cust extends Thread
{
	private bankacc account;
	private int amount;
	private boolean isdepositor;
	public Cust(bankacc account , int amount , String name , boolean isdepositor)
	{
		super(name);
		this.account = account;
		this.amount = amount;
		this.isdepositor = isdepositor;
	}
	public void run()
	{
		if(isdepositor)
		{
			account.deposit(amount,Thread.currentThread().getName());
		}
		else
		{
			account.withdraw(amount,Thread.currentThread().getName());
		}
	}
}
public class Bigbank
{
	public static void main(String[]args)
	{
		bankacc account = new bankacc();
		Cust c1 = new Cust(account,1200,"Alice",false);
		Cust c2 = new Cust(account,500,"Bob",false);
		Cust dep = new Cust(account,1000,"Charlie",true);
		c1.start();
		c2.start();
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		dep.start();
	}
}
