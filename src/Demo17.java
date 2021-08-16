//video	22 calling parent class constructor

class Parent1 
{ 
	void m1()
	{
		System.out.println("Parent class method");
	}

	Parent1()
	{
		System.out.println("Parent class constructor");
	}

}

class Demo17 extends Parent1 
{
	void m1()
	{
		System.out.println("Child class method");

	}
	void m2()
	{
		super.m1();
		m1();
		//super.m1();
	}

	Demo17()
	{
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) throws  ClassNotFoundException
	{		
		new Demo17().m2();
	
	}
}





