//video 35 ---interface can be declared inside the class and can be called as given below
class Test
{ 
	interface It2
	{
	void m1();
	}
}

class Demo35 implements Test.It2 //look at the code 
{
	public void m1()
	{ System.out.println("m1 method inside It2 interface which is inside class Test"); }
	public static void main(String[] args) 
	{
		new Demo35().m1();
	}
}
