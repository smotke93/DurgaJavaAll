//video 35 ---nested interface
interface It11
{ 
	interface It2
	{
	void m1();
	}
}

class Demo34 implements It11.It2 //look at the code...(parent interface).childInterface  
{
	public void m1()
	{ System.out.println("m1 method inside It2 interface which is inside It1 interface"); }
	public static void main(String[] args) 
	{
		new Demo34().m1();
	}
}
