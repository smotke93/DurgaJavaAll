//video 35....Abstraction to hide data just like ATM

interface It13
{ int a=10; //both the variable have same name so it gives ambiguity problem while calling
}
interface It21
{  int a=20;
}

class Demo37 implements It13,It21 
{

	public static void main(String[] args) 
	{
		 //both the variable have same name so it gives ambiguity problem while calling
//as the variables are STATIC we can call them using class/interface name
	System.out.println(It13.a); 
	System.out.println(It21.a);
}
	
}




