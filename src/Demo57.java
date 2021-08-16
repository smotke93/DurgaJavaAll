/*Video- 57
This example explains the Inner class concept i.e ANONYMOUS Class*/
/*
class Thread
{public void run(){}
}
*/

class Demo57 
{
	Thread obj1 = new Thread()
	{	public void run() {System.out.println("Method 1 from Anonymous class");}
	};

	public static void main(String[] args) 
	{
		Demo57 obj2 = new Demo57();
		obj2.obj1.run();

		System.out.println("Hello World!");
	}
}
