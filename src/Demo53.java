class MyThread2 extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++ )
		{
		try{ Thread.sleep(1000);
			System.out.println("Daemon functionality");
			}
			catch(Exception e)
			{e.printStackTrace();}
		
		}
	}
}


class Demo53 
{
	public static void main(String[] args) 
	{
		 /*This are the two methods of Daemon Thread got from javap java.lang.Thread 
		 public final void setDaemon(boolean);
		 public final boolean isDaemon();*/
		MyThread2 t1 = new MyThread2();
		t1.setDaemon(true);

		t1.start();
		for (int i=0;i<5 ;i++ )
		{
			try{ t1.sleep(1000);
				System.out.println("Main Thread");}
			catch(Exception e)
			{e.printStackTrace();}
		}
		
	}
}
