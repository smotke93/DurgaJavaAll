//assignment from video 9 by RATAN

class Demo4 
{
	//instance variables
	int a = 10;
	int b=20;
	
	//static variables
	static int c= 30;
	static int d = 40;
	static int e = 50;

	//static method
	static void m1()
	{
	 Demo4 obj2 = new Demo4();
	 System.out.println("From Static Method output -");
	 System.out.println("Instance variables");
	 System.out.println("A ="+obj2.a);
	 System.out.println("B ="+obj2.b);
	
	 System.out.println("Static variables");
	// There are three ways to call static variables inside the static methods as followed
	    System.out.println("C ="+Demo4.c);	//by using class name
	    System.out.println("D ="+d);		//by directly calling the static variable
		System.out.println("E ="+obj2.e);	//by using object of class
	}
	
	//instance method
	 void m2()
	{
	 System.out.println("\nFrom instance Method output -");
	 System.out.println("Instance variables");	
	 System.out.println("A ="+a);
	 System.out.println("B ="+b);

	 System.out.println("Static variables");
	 System.out.println("C ="+Demo4.c);
	 System.out.println("D ="+Demo4.d);
	 System.out.println("E ="+Demo4.e);
	}
	
	public static void main(String[] args) 
	{
		Demo4 obj1 = new Demo4();
		obj1.m2();

		Demo4.m1(); 
	}
}
