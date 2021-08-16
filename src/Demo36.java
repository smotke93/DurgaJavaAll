//video 35

interface It12 //by default it is ABSTRACT
{
	int a= 10; //by default it is PUBLIC and STATIC and FINAL

	void m1(); //by default it is PUBLIC and ABSTRACT
}


class Demo36 implements It12
{
	public void m1() {System.out.println("M1 method implmented");}
	public static void main(String[] args) 
	{
		System.out.println("a value = "+a);
		new Demo36().m1();
	}
}
