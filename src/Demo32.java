//video 34 Interface demo part 1

interface It2
{
	//by default these methods are public AND abstract
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class Test1 implements It2
{ public void m1() {System.out.println("m1 implemented in Test1");} }

abstract class Test2 extends Test1
{ public void m2() {System.out.println("m2 implemented in Test2");} }

abstract class Test3 extends Test2
{ public void m3() {System.out.println("m3 implemented in Test3");} }

class Demo32 extends Test3
{
	//we have to maintain the modifier of method at the same level i.e public - public

	public void m4()
	{	System.out.println("m4 implemented in Test4"); }

	public static void main(String[] args) 
	{
	It2 obj = new Demo32();
	obj.m1();
	obj.m2();
	obj.m3();
	obj.m4();
	}
}
