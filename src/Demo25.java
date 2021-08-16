
//video 27 private methods cannot be override
//thus we will get compile time error in below program
class Parent9
{
	private void m1()
	{
		System.out.println("private m1 method from parent class");
	}
}

class Demo25 extends Parent9
{
	private void m1()
	{
		System.out.println("private m1 method from child class");
	}
	public static void main(String[] args) 
	{
	 Parent9 obj = new Parent9();
	 obj.m1(); //we are getting error coz private methods cannot be override.
	 //the scope of the private method is within the class itself 
	}
}



