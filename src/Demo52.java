class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<6 ;i++ )
		{
			System.out.println(Thread.currentThread().getName());
			Thread.yield();	
		}
	}

}

class Demo52 
{
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();

		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<4 ;i++ )
		{
			System.out.println(Thread.currentThread().getName());
				
				for(int j=0;j<4 ;j++ )
			{System.out.println("Sankalp");}
		}

		
	}
}
