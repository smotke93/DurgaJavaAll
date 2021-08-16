class Mythread1 extends Thread
{
	public void run() {}}
class Test007
{
	public static void main(String[] args)
	{
		Mythread1 obj1 = new Mythread1();
		Mythread1 obj2 = new Mythread1();
		Mythread1 obj3 = new Mythread1();
	
System.out.println(obj1.getId());
System.out.println(obj1.getName());
System.out.println(obj1.getPriority());
System.out.println(obj1.getStackTrace());
System.out.println(obj1.getState());
System.out.println(obj1.isAlive());
System.out.println(obj1.isDaemon());
	
	
	
	}
	}