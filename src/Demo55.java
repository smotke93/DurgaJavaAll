/*all the program is same as Demo54 
only difference is please see the notebook OR ratan video for explanation*/

class MyThread5 extends Thread  
{
	public void run() 
	{	for (int i=0;i<5 ;i++ )
		{
		try
		{
			System.out.println(Thread.currentThread().getName()+"---> "+i);
		Thread.sleep(8000);			
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		}
	}
}

class Demo55
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();

		t1.start();
		System.out.println("now Main thread has to wait completion of the Thread t0");
		
		t1.join(5000);
		System.out.println("now Main & t1 thread can execute");
		t2.start();
		for (int i=0;i<5 ;i++ )
		{
		System.out.println(Thread.currentThread().getName()+"---> "+i);
		Thread.sleep(8000);

		}
	}
}
