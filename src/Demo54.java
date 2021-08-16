class MyThread4 extends Thread  
{
	public void run() 
	{	for (int i=0;i<5 ;i++ )
		{
		try
		{
			System.out.println(Thread.currentThread().getName()+"---> "+i);
		Thread.sleep(1000);			
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		}
	}
}

class Demo54 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread4 t1 = new MyThread4();
		MyThread4 t2 = new MyThread4();

		t1.start();
		System.out.println("now Main thread has to wait completion of the Thread t0");
		t1.join();
		System.out.println("now Main & t1 thread can execute");
		t2.start();
		for (int i=0;i<5 ;i++ )
		{
		System.out.println(Thread.currentThread().getName()+"---> "+i);
		Thread.sleep(1000);

		}
	}
}
