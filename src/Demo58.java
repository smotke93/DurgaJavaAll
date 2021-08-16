interface Itt1
{
//abstract methods
	void m1();
	void m2();
}

/*
class Child implements Itt1
{ public void m1() { System.out.println("m1 method implementation");}
public void m2() { System.out.println("m2 method implementation"); }
}
class Demo58
{ 
	public static void main(String[] args)
	{
	Child obj = new Child();
	obj.m1();
	obj.m2();
	}
} */

class Demo58 
{
	// it doesnot mean we are  creating It1 class object
	// it means we are creating a separate class whose name can be obtained as given below
	Itt1 itr = new Itt1()
	{	
		public void m1() 
			{	System.out.println(itr.getClass().getName());
				System.out.println("Method 1 from Anonymous class");
			}
		public void m2() {System.out.println("Method 2 from Anonymous class");}
	};

	public static void main(String[] args) 
	{
		Demo58 obj2 = new Demo58();
		obj2.itr.m1();
		obj2.itr.m2();
	}
}
