
//video 29 --Polymorphism part 6
//in this example we are going to see how abstract class supports method,constructor,instance block and static block

abstract class Parent
{
	//static block
	static
	{ 		System.out.println("Static block of abstract class");	}
	//instance block
	{		System.out.println("Instance block of abstract class");	}
	//constructor
	Parent()
	{		System.out.println("Parent constructor");	}
	//abstract methods
	abstract void m1();
}
class Demo28 extends Parent  
{
	//static block
	static
	{		System.out.println("Static block of child class");	}
	//instance block
	{		System.out.println("Instance block of child class");	}
	//abstract method implementation
	void m1()
	{		System.out.println("Abstract method implementation in child class");	}
	//constructor
	Demo28()
	{		System.out.println("child constructor");	}
	
	public static void main(String[] args) 
	{new Demo28().m1();}
}




