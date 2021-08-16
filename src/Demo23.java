
//video 23 Polymorphism p-3 very important
class Parent7
{
	void m1()
	{
		System.out.println("m1 method from Parent class");
	}
}

class Demo23 extends Parent7  // (video 14)
{
	
	void m1()
	{
		System.out.println("Parent class m1 method we are unable to call so we use different approach as shown in demo24");
		System.out.println("m1 method from Child class");
	}
	static void m2()
	{
		System.out.println("m2 static method from Child class");
	}
	
	public static void main(String[] args) 
	{		
		Parent7 a = new Demo23();
		//here obj of class Demo23 is hold by reference variable of parent class
		a.m1(); 
		//during compile time it checks the whether the m1 method is present in parent class
		//but during runtime the child class method is run, bcoz the obj created is of child class i.e Demo23 class
	

		//to call the m2 method we need to do following steps
		Demo23 c = (Demo23)a;
		c.m2(); 
		
		((Demo23)a).m1();
		/* OR
		Demo23.m2(); */
	
	}
}




