package dhaiwik;

public class Runnable_dem implements Runnable 
{
	public void run()
	{
		for ( int i = 1 ; i <= 5 ; i ++)
		{
			System.out.println("Runnable Thread:" + i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[]args)
	{
		Runnable_dem r = new Runnable_dem();
		Thread t = new Thread(r);
		t.start();
	}
}
