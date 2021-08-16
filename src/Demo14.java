class Demo14 // (video 14 Example 1)
{
		
		Demo14()
		{
			System.out.println("Default Constructor");
			
		}
		Demo14(int a)
		{
			System.out.println("1-Parameterised Constructor");
			
		}
		Demo14(int a, int b)
		{
			System.out.println("2-Parameterised Constructor");
		}
		{
			System.out.println("Instance block 1");
		}
		

	public static void main(String[] args) 
	{
			new Demo14();
			new Demo14(5);
			new Demo14(5,15);		
	}
}




