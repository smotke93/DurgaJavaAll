//Video 10
//in this program we will see how the object will affect the static and instance variables


//for every object new memory is assigned to it
//when it come to static variables all the object points to single memory location and thus changes made at the memory location can be seen
class Demo6 
{
	//instance var
	int a =10;

	//static var
	static int b= 20;

	public static void main(String[] args) 
	{
	Demo6 obj1 = new Demo6();
	System.out.println("\n Calling through obj1");
	System.out.println(obj1.a);
	System.out.println(Demo6.b);

	System.out.println("\n After changing the values through obj1");
	obj1.a=100;
	Demo6.b=200;

	System.out.println("\n"+obj1.a);
	System.out.println(Demo6.b);
	
	Demo6 obj2 = new Demo6();
	System.out.println("\n Simply Calling through obj2");
	System.out.println(obj2.a);
	System.out.println(Demo6.b);
	
	}
}
