class Demo16 extends Parent4  // (video 21 Inheritance part 2)
{
	int i=20; 
	int j=20;
	
	void add(int i, int j)
	{
		System.out.println(i+j);//local variables
		System.out.println(this.i+this.j); //instance variables
		System.out.println(super.i+super.j);
	}

	public static void main(String[] args) throws  ClassNotFoundException
	{		
		new Demo16().add(30,30);
	
	}
}

class Parent4 
{ 
	int i = 10;
	int j=10;
}


