package dhaiwik;

class OrewaThread extends Thread 
{
	public void run()
	{
		for(int i = 1 ; i <= 5 ; i ++)
		{
			System.out.println("Thread Running: " + i);
		}
	}
	public static void main(String[]args)
	{
		OrewaThread t1 = new OrewaThread();
		OrewaThread t2 = new OrewaThread();
		OrewaThread t3 = new OrewaThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
