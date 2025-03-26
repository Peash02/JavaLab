package dhaiwik;

class Bankacc 
{
	private int balance = 1000;
	public synchronized void withdraw(int amount , String name)
	{
		if (balance >= amount)
		{
			System.out.println(name + " is withdrawing " + amount);
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
			balance -= amount;
			System.out.println(name + " completed withdrawal.Remaining Balance is " + balance);
		}
		else
		{
			System.out.println(name + " attempted To withdraw " + amount + " but insufficient balance.");
		}
	}

}
class cust extends Thread
{
	private Bankacc account;
	private int amount;
	public cust(Bankacc account , int amount , String name)
	{
		super(name);
		this.account = account;
		this.amount = amount;
	}
	public void run()
	{
		account.withdraw(amount, Thread.currentThread().getName());
	}
}
public class Bank
{
	public static void main(String[]args)
	{
		Bankacc account = new Bankacc();
		cust c1 = new cust(account,700,"Alice");
		cust c2 = new cust(account,500,"Bob");
		cust c3 = new cust(account,400,"Charlie");
		c1.start();
		c2.start();
		c3.start();
		
	}
	
}
