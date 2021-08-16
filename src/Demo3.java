//now we will learn about STATIC Variable

class Demo3 
{
	static int a=10;
	static int b=20;

	//static method
	public static void main(String[] args) 
	{
		//static area
		System.out.println("Output from main method");
		System.out.println(Demo3.a);

		//need to call user defined method
		Demo3 obj = new Demo3();
		obj.m1();
	}

	//instance method
	void m1()
	{
		//instance area
		System.out.println("Output From Instance Method1");
		System.out.println(Demo3.b);
	}

}
