//constructor calling

class Demo12 // (video 16)
{
		Demo12()
		{
			this(9);
			System.out.println("Default Constructor");
			
		}
		Demo12(int a)
		{
			this(90,100);
			System.out.println("1-Parameterised Constructor");
			
		}
		Demo12(int a,int b)
		{
			System.out.println("2-Parameterised Constructor");
		}


	public static void main(String[] args) 
	{
		
		new Demo12();
		
	}
}