class GrandParent1
{ 
	{
		System.out.println("GrandParent class instance block");
	}


}

class Parent3 extends GrandParent1
{ 
	{
		System.out.println("Parent class instance block");
	}


}


class Demo19 extends Parent3  // video 23, parent class Instance blocks 
{
	{
		System.out.println("Child class instance block");
	}
	

	
	public static void main(String[] args) throws  ClassNotFoundException
	{		
		new Demo19();
	
	}
}




