//video 27
//as we have seen in the Demo23 that the parent class method we are unable to call so we are using below approach 
// imp thing is that we came to know that static method cannot be override in java
//also called method hidding concept

class Parent8
{
	static void m1()
	{
		System.out.println("static method m1 from parent class");
	}
}


class Demo24 extends Parent8
{
	 static void m1()
	{
		System.out.println("static method m1 from child class");
	}

	public static void main(String[] args) 
	{
		//same approach we are using as in Demo23
		Parent8 a= new Demo24(); //static method are born with class i.e .class file, so parent class method is executed
		a.m1();
	}
}
