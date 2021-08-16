class Demo46 
{
	int[] m1()
	{
		System.out.println("m1 method");
		int[] a = {10,20,30};
		return a;
	}

	void m2(double[] d)
	{
		System.out.println("m2 method");
		for(double dd: d)
		{
			System.out.println(dd);
		}
	}
	public static void main(String[] args) 
	{
		Demo46 obj = new Demo46();
		/*obj.m1(); --->  only prints ---> m1 method*/
		int[] b= obj.m1();
		for(int bb : b)
		{System.out.println(bb);}

		double[] d={12.2,13.3,14.4};
		obj.m2(d);
	}
}
