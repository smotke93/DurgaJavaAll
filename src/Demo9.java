// (video 14 Example - 1)
class Demo9 
{
		int m1()
		{
			System.out.println("m1 method");
			return 10;
		}
		float m2()
		{
			System.out.println("m2 method");
			return 10.5f;
		}

		static char m3()
	{
		System.out.println("m3 method");
		return 's';
	}

	public static void main(String[] args) 
	{
		Demo9 t= new Demo9();
		int i =t.m1(); //t.m1() calls the method m1. we have created int i just to store the value somewhere
		System.out.println(i);	

		float j =t.m2();
		System.out.println(j);
		
		char k=Demo9.m3();
		System.out.println(k);
	}
}




