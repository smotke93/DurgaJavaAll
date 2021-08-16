class GrandParent 
{ 
	GrandParent()
	{
		System.out.println("GrandParent class 0-arg constructor");
	}
}

class Parent2 extends GrandParent1
{ 
	Parent2()
	{
		super(); //here we have defined the super keyword but below in Deo18 class we wont
		
		System.out.println("Parent class 0-arg constructor");
	}

}


class Demo18 extends Parent2  // (video 14)
{

	Demo18()
	{
		//here compiler will create the super keyword automatically and execute the program
		//2nd important point is that the compiler defined "super" keyword is always calling the zero argument constructor
		System.out.println("Child class 0-arg constructor");

	}
	
	public static void main(String[] args)
	{		
		new Demo18();
		
	
	}
}




