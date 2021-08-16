class GrandParent2
{ 
	static
	{
		System.out.println("GrandParent class static block");
	}

	{
		System.out.println("GrandParent class instance block");
	}

	GrandParent2() //defualt
	{
		System.out.println("GrandParent class constructor block\n");
	}
}

class Parent5 extends GrandParent2
{ 
	static
	{
		System.out.println("Parent class static block");
	}

	{
		System.out.println("Parent class instance block");
	}

	Parent5()
	{
		System.out.println("Parent class constructor block\n");
	}

}

class Demo20 extends Parent5  // video 23 example -2 , parent class static blocks, instance block and constructors 
{
	static
	{
		System.out.println("Child class static block\n");
		
	}
	
	{
		System.out.println("Child class instance block");
	}
	
	Demo20()
	{
		System.out.println("Child class constructor block\n");
	}
	

	public static void main(String[] args) throws  ClassNotFoundException
	{
	new Demo20();
	new Demo20();

	}
}




