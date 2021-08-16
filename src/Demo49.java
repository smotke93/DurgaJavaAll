//Multithreading example
class MainThread extends Thread
{
	public void run()
	{}
}
class Demo49 
{
	public static void main(String[] args) 
	{
		MainThread t1= new MainThread();
		MainThread t2 = new MainThread();

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		System.out.println("Now we will the change the name of the Thread");
		t1.setName("sankalp's-thread");
		t2.setName("tanu's-thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println("To get the name of main thread");
		System.out.println(Thread.currentThread().getName());

		System.out.println("To change the name of main thread");
		Thread.currentThread().setName("Sankalps-Main-Thread");
		System.out.println(Thread.currentThread().getName());

		System.out.println("Every thread contains some ID");
		System.out.println(t1.getId());
		System.out.println(t2.getId());

		System.out.println("wanted to check whether the thread is alive gives Boolean value");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());

		System.out.println("how many no of threads present in application");
		System.out.println("output many vary run more time to see diff results");
		System.out.println(Thread.activeCount());
		
	}
}
