//video 25 - Polymorphism part -2
class Animal {}
class Dog extends Animal {}

class Parent6 
{
	Animal m1()
	{
	System.out.println("Parent class m1 method of type Class Animal");
	Animal a = new Animal();
	return a;
	}
}


class Demo22  extends Parent6 
{
	Dog m1()
	{
		System.out.println("Child class m1 method of type Class Dog");
		return new Dog();
	}
	public static void main(String[] args) 
	{
	new Demo22().m1();
	
	
	}
}
