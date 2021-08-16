
class ThreadDemo extends Thread
{
	public void run()
	{System.out.println(Thread.currentThread().getName()+" --> "+Thread.currentThread().getPriority());}
	 
}
class Demo50 
{
	public static void main(String[] args) 
	{
		System.out.println("Different ways to set PRIORITY");
		ThreadDemo t1 = new ThreadDemo();
		t1.setPriority(8);
		ThreadDemo t2 = new ThreadDemo();
		t2.setPriority(Thread.MAX_PRIORITY);
		ThreadDemo t3 = new ThreadDemo();
		t3.setPriority(Thread.MIN_PRIORITY);
		ThreadDemo t4 = new ThreadDemo();
		t4.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
