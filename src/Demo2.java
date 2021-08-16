//in this program we are going to study the instance and static variables along with there scope

class Demo2 
{
	//instance variable
	int a=100;
	int b=200;

	//static method 
	public static void main(String[] args) 
	{
		//static area
		//if we want to access the instance variable inside the static method OR static area
		//we use the object
		Demo2 obj = new Demo2();
		System.out.println(obj.a+ " from main method");
		System.out.println(obj.b+" from main method");
		obj.m1();

	}

	//instance method 
	void m1()
	{
		//instance area
		System.out.println(a);		
		System.out.println(b);

	}
}
