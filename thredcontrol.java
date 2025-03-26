package dhaiwik;

class thred extends Thread
{
	private volatile boolean suspended = false;
	private volatile boolean stopped = false;
	
	public void run()
	{
		synchronized(this)
		{
			while(!stopped)
			{
				try
				{
					while(suspended)
					{
						wait();
					}
					System.out.println(Thread.currentThread().getName() + " is running....");
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(Thread.currentThread().getName() + " interrupted.");
				}
			}
			System.out.println(Thread.currentThread().getName() + " stopped.");
		}
	}
	public void suspendthred()
	{
		suspended = true;
	}
	public synchronized void resumethred()
	{
		suspended = false;
		notify();
	}
	public void stopthred()
	{
		stopped = true;
	}

}
public class thredcontrol
{
	public static void main(String[]args)
	{
		thred t = new thred();
		t.start();
		try
		{
			Thread.sleep(3000);
			
			System.out.println("Suspending Thread...");
			t.suspendthred();
			Thread.sleep(3000);
			
			System.out.println("Resuming Thread...");
			t.resumethred();
			Thread.sleep(3000);
			
			System.out.println("Stopping Thread...");
			t.stopthred();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
