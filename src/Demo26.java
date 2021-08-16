//video 28....Abstraction to hide data just like ATM

//user see the UI
abstract class ATM_UI
{
	void m1()
	{
		System.out.println("m1 method from abstract class");
	}
	abstract void m2();
	abstract void m3();
	void m4(){} //general method with no implementation

}
//but implementation is in child class
class Demo26 extends ATM_UI  // (video 14)
{
	void m2()
	{
		System.out.println("m2 abstract method from Child class implementation");
	}
	void m3()
	{
		System.out.println("m3 abstract method from Child class implementation");
	}
	
	
	void m4()
	{
		System.out.println("m4 general method from Child class implementation");
	}
	 
	
	public static void main(String[] args) 
	{		
		Demo26 obj = new Demo26();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
	}


}




