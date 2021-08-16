class MyThread extends Thread
{
	public void run()
	{System.out.println("Hook Funtionality block");}
}
class Demo51 
{
	public static void main(String[] args) 
	{
		MyThread1 t  = new MyThread1();

		Runtime obj  = Runtime.getRuntime();
		obj.addShutdownHook(t);

		try
			{
				for (int i=0;i<5;i++ )
				{
				System.out.println("for block");
				Thread.sleep(1000);
				}
			}
		catch ( InterruptedException ie)
			{
				ie.printStackTrace();
			}
	}
		
}
