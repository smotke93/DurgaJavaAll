//in this example we are going to see how static blocks are used to initialized the static variables and how to call the class Z static block without main in Z class
class Demo15 // (video 19)
{
	static
		{
			System.out.println("Demo15 class static block");
			Demo15.no = 23;
		}
		
		static int no;

	static void display()
	{
		System.out.println(Demo15.no);
	}

	public static void main(String[] args) throws  ClassNotFoundException //add exception
	{	
		
		//Demo15.display();

		Class.forName("Z");
//this is the method of CLASS class which helps to dynamically load the other class Z given below runtime so that static block can be executed without main() of Z class
		}
}

class Z 
{ 
	static
		{
			System.out.println("Z class static block");
		}
}


