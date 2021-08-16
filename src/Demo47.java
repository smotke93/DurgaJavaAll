//in this example we have used Employee & student class

class Demo47 
{
	public static void main(String[] args) 
	{
	Object[] o = new Object[3];
	o[0] = new Employee(101,"SAM");
	o[1] = new Student(1001,"SAMAVI");
	o[2] = new Integer(10);
	
	for(Object oo: o)
		{
		//NOTE - only for user defined type we must define the type casting 
		//for printing Employee data use instanceof
		if(oo instanceof Employee)
			{ /*1. print oo
				2. of type Employee
				3. create new obj to store oo*/
			Employee obj1=(Employee)oo;
		System.out.println("id="+obj1.eid+" Namae="+obj1.ename);
			}
			
			if(oo instanceof Student)
			{		Student obj2=(Student)oo;
		System.out.println("id="+obj2.sid+" Namae="+obj2.sname);
			}
			
			//this is a wrapper class & hence type casting is not required
			// directly it prints the data
			if(oo instanceof Integer)
			{System.out.println(oo);}
		}
}
	
}




