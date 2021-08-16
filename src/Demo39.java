//video 36 very very important point
//very important point is that if you want to use CLONE method then your class must IMPLEMENT CLONEABLE INTERFACE
class Demo39 implements Cloneable
{
	int a=10;//1
	int b=20;//2
	public static void main(String[] args) throws Exception
		{
		Demo39 obj = new Demo39();

		System.out.println(obj.a);//11 a=10
		System.out.println(obj.b);//22 b=20
		
		
		obj.a=100;//11 a =100
		obj.b=200;//22 b=200
		System.out.println(obj.a);
		System.out.println(obj.b);

		obj.a=1000; //11 a=1000
		obj.b=2000;// 22 b=200
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		//to clone the value of A & B we do :-
		Demo39 obj2 = (Demo39)obj.clone();   //obj2 is the duplicate object of obj
		//here CLONE is the method and CLONE method's return type is object class. So type cast into Demo39 class
		//here we are simply maintaining the backup of data
		
		obj.a=10000;//11 a=10000
		obj.b=20000;//22 b=20000
		System.out.println(obj.a);
		System.out.println(obj.b);


		//now suppose here i want to print the value of a=1000 and b=2000
		//but now it is impossible bcoz the value of A & B are changed so we can use cloning object method here
		System.out.println("After calling cloneable method");
		System.out.println(obj2.a);
		System.out.println(obj2.b);


	}
}
