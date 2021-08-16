//adapter concept---video 35

interface It14
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
}
class Test4 implements It14 //called as adapter class
{
	//these are empty implementations
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
	public void m6(){}
	public void m7(){}
}

//actual implementation is done here
class Demo38 extends Test4
{
	public void m2(){System.out.println("M2 method required so implemented it");}
	public void m5(){System.out.println("M5 method required so implemented it");}
	public void m7(){System.out.println("M7 method required so implemented it");}
	public static void main(String[] args) 
	{
		System.out.println("only 2,5,7 method are implemented out of all 7 methods");
		new Demo38().m2();
		new Demo38().m5();
		new Demo38().m7();
	}
}
