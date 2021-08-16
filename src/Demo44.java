/*video 60 Array Part -1*/
class Demo44 
{
	public static void main(String[] args) 
	{
		System.out.println("out of 5 employees 2 places are NULL print all details");
		Employee e1= new Employee(111,"SAM");
		Employee e2= new Employee(222,"SAVI");
		Employee e3= new Employee(333,"SAMAVI");
		
		/*create array of employee type & store values in it*/
		Employee[] a = new Employee[5];
		a[0]=e1;	
		a[2]=e2;
		a[4]=e3;

		/*printing via for each loop
		Syntax --> 
		for(data_type variable-create-new :reference-variable)
		right side = which variable you are prinitng ---> a
		left side = what is the type of variable you are printing -----> Employee
		
		Below code gives NullPointerException bcoz we are calling eid & ename on null index
		for(Employee obj: a)
		{ System.out.println("Eid = "+obj.eid+" Ename = "+obj.ename);	}
		*/
		
		/*so use Object class to store both Employee data & Null values*/
		for(Object obj: a)
		{
			//instanceof --> is used to check the type of object in Employee class
			if(obj instanceof Employee)
			{
				//now we cannot directly call the obj.eid OR obj.ename so we do following
				//type cast "obj" into Employee & store it in some var
				Employee var = (Employee)obj;
					System.out.println("Eid = "+var.eid+" Ename = "+var.ename);
					
			}
		
			if(obj==null)
			{System.out.println(obj);}

		}
		System.out.println("printing the index of null values");	
			//now if i want to print the index of null values
			for(int i=0; i < a.length;i++)
			{
				if(a[i]==null)
				{
				System.out.println(i);}
			}
		
	}
}
