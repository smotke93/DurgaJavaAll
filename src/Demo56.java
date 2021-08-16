class MyThread6 extends Thread
{
	public void run()
	{ 
		for (int i=0;i<5 ;i++ )
		{
		
		System.out.println("User Thread");
	try{
		Thread.sleep(1000);
	}
	catch(InterruptedException ie)
		{System.out.println("Interrupted Method");}
		}
	}
}

class Demo56 
{
	public static void main(String[] args) 
	{
		MyThread6 t1 = new MyThread6();
		t1.start();
		t1.interrupt();
	}
}
