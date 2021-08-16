class Demo48
{
	public static void main(String[] args) 
	{
		try{
		System.out.println(10/0);
	}
	//catch(Throwable e)
	//OR
		
		catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.getMessage());

	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.getMessage());

	}

	}
}



