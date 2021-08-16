
class Demo59 
{

	public static void main(String[] args) 
	{

			Thread obj1 = new Thread()
				{	public void run() 
					{ System.out.println("Thread 1");}
				};
			
			Thread obj2 = new Thread()
				{	public void run() 
						{System.out.println("Thread 2");}
				};

/*create the nameless object & then calling the start method directly*/
    new Thread(){public void run(){ System.out.println(obj1.getClass().getName()); 
									System.out.println("Thread 3");}}.start();

			obj1.start();
			obj2.start();

	}
}
