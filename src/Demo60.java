class Counter
{	//now we are making the below method as SYNCHRONIZED so at a time only 1 thread will access it
	synchronized static void ticket(String str)
	{		for(int i =0;i<4;i++)
		{			try
			{ System.out.println(str);
				Thread.sleep(1000);
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class Client1 extends Thread
{ public void run() {new Counter().ticket("Client----1");} }
class Client2 extends Thread
{ public void run() {new Counter().ticket("Client----2");} }
class Client3 extends Thread
{ public void run() {new Counter().ticket("Client----3");} }

class Demo60 
{
	public static void main(String[] args) 
	{
		new Client1().start();
		new Client2().start();
		new Client3().start();
	}
}
