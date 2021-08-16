//array video 61 assignment
class Demo45 
{
	
	public static void main(String[] args) 
	{
		int[]  a = {10,20,30,40,50};	

		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of all elements = "+sum);

		int max=0;
		int min=0;
		for(int i=0;i<a.length ;i++ )
		{
			for(int j=0;j<a.length ;j++ )
			{
				if(a[i]<a[j])
				{
					min=a[i];
					//System.out.println("Min no is = "+min);
				}
				else 
				{
					max=a[i];
					//System.out.println("Max no is = "+max);
				}			
			
			}
		}
		System.out.println("Min no is = "+min);
		System.out.println("Max no is = "+max);

		
	}
}
