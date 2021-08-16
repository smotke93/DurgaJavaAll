//video 28..example 2....Abstraction to hide data just like ATM

//user see the UI
abstract class ATM_0
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();

}
abstract class ATM_1 extends ATM_0
{
	void m1()
	{
		System.out.println("m1 method implementation in ATM_1");
	}
}
abstract class ATM_2 extends ATM_1
{
	void m2()
	{
		System.out.println("m2 method implementation in ATM_2");
	}
}
abstract class ATM_3 extends ATM_2
{
	void m3()
	{
		System.out.println("m3 method implementation in ATM_3");
	}
}

class Demo27 extends ATM_3  
{
	
	void m4()
	{
		System.out.println("m4 method implementation in Demo27");
	}
	
	public static void main(String[] args) 
	{		
		Demo27 obj = new Demo27();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}




