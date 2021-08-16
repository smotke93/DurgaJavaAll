interface It1
{
	//by default these methods are public AND abstract
	void m1();
	void m2();
}
class  Demo31 implements It1
{
	//we have to maintain the modifier of method at the same level i.e public - public or increasing level

	public void m1()
	{	System.out.println("M1 method");}

	public void m2()
	{	System.out.println("M2 method");}

	
	public static void main(String[] args) 
	{
	//compiler will search for the methods with same name in the parent class and while execution it executes the child class method
	It1 obj = new Demo31();
	obj.m1();
	obj.m2();
	}
}
