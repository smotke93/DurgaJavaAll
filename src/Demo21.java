//video 24
class Demo21 
{
	void m1(char b)
	{
		System.out.println("M1 Method 1 arg char type "+b);
	}
	void m1(int a)
	{
		System.out.println("M1 Method 1 arg int type "+a);
	}
	void m1(int a,int b)
	{
		System.out.println("M1 Method 2 args int type "+a+" "+b);
	}

	Demo21(char s)
	{
		System.out.println("Constructor 1 arg char type");
	}
	Demo21(int a)
	{
		System.out.println("Constructor 1 arg int type");
	}
	Demo21(int a,int b)
	{
		System.out.println("Constructor 2 arg int type");
	}

	public static void main(String[] args) 
	{
		System.out.println("Constructor & method overloading - ");
		
		new Demo21('a').m1('b');
		new Demo21(2).m1(3);
		new Demo21(3,4).m1(5,6);
		

		System.out.println("Oerator Overloaing - \n");
		System.out.println(10+20);
		System.out.println("Sankap"+"Motke");

	}
}
