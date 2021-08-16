//Video 14 example 3
//same class object
class Demo11 
{
	Demo11 m1() //here method name is same as that of class name
	{
		System.out.println("M1 method");
		return new Demo11();

		//OR
		
	//	Demo11 d = new Demo11();
	//	return d;
   }

	Demo11 m2()
	{
		System.out.println("M2 method");
		return this;
	}

	public static void main(String[] args) 
	{
		Demo11 obj = new Demo11();
		/*
		obj.m1();
		obj.m2();
		
		OR*/

		//just to store the value we can declare as below
		Demo11 obj1= obj.m1();
		System.out.println(obj1);
		new Demo11().m2();
		
	}
}
