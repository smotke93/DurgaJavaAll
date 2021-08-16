//Video 13 example 1
class Demo7 
{
	void m1(int a, char b)
	{
		System.out.println("Output from Method m1");
		System.out.println(a);
		System.out.println(b);
	}
	static void m2(String c, double d)
	{
		System.out.println("Output from Method m2");
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Demo7 obj = new Demo7();
		obj.m1(07,'S');
		Demo7.m2("SAM",50.50);
	}
}
