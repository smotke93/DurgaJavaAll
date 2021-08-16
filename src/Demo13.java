//constructor calling

class Demo13 // (video 16) example 2
{
		Demo13()
		{
			
			System.out.println("Default Constructor");
			
		}
		Demo13(int a)
		{
			
			System.out.println("1-Parameterised Constructor");
			
		}
		Demo13(int a,int b)
		{
			System.out.println("2-Parameterised Constructor");
		}


	public static void main(String[] args) 
	{
		/*formats of object creation
		1. Named object approach
		2. Name less approach*/
		Demo13 obj1 = new Demo13();
		Demo13 obj2 = new Demo13(10);
		Demo13 obj3 = new Demo13(20,20);


		//nameless approach
		new Demo13();
		new Demo13(100);
		new Demo13(200,300);
	}
}