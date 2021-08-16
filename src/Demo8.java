//Video 13
//In this example we will see how the + operator works differently
class Demo8 
{
	public static void main(String[] args) 
	{
		System.out.println(10+20);
		System.out.println("The answer 10+20+'A' = 95 bcoz it took ASCII Value of 'A' & i think it is considered as a char");
		System.out.println(10+20+'A'+"\n");
		
		System.out.println("The answer 10+20+''A'' = 30A bcoz ''A'' i think A it is considered as a String as it is in double quotes");
		System.out.println(10+20+"A");
		System.out.println(10+20+"A"+"B");
		System.out.println(10+20+"A"+"B"+10+20);
	}
}
