// (video 14 Example - 2)

/* method vs returning objects
in project level primitive values. In real time we are returning objects as return value or class as return value*/ 

//here the two classes can be of different module
class Emp {}
class X {}

class Demo10 
{
		 char a3()
		{
			System.out.println("a3 method declared & defined in Demo10 class only");
			return 's';
		}
		
		Emp a1() //a1 method of Emp type so at the end we have to return object of Emp
		{
			System.out.println("a1 method of type Emp but defined in Demo10 class");
			Emp e = new Emp(); //so create the object and return that object
			return e; //by default it will print the hash code
		}
		
		X a2()
		{
			System.out.println("a2 method of type Emp but defined in Demo10 class");
			X x= new X();
			return x;
		}

		
	public static void main(String[] args) 
	{
			Demo10 t= new Demo10();

		 //to call a1 method, again create the object of Emp class and call the method
		 //the object name can be same or different does not make any sense. The type is imp which is Emp
		 Emp e = t.a1();
		 System.out.println(e+" is the address of the object \n");

		 X x1 = t.a2();
		 System.out.println(x1+ " is the address of the object\n");
		
	
		 char a = t.a3();
		 System.out.println(a);
	}
}




