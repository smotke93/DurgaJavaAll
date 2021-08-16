//video 46
import java.lang.*;
class Demo42
{
	int eid;
	String ename;

	Demo42(int eid,String ename)
	{ this.eid=eid; this.ename=ename; }

	//return type of toString is always String
	public String toString()
	{ return "eid ="+eid+" ename ="+ename;
	}

	public static void main(String[] args) 
	{
		//String is immutable class, modification is not allowed
		String s1="Ratan";
		s1.concat("soft"); //method of String class
		System.out.println(s1);

		//StringBuffer is mutable class, modification is allowed
		StringBuffer sb1 = new StringBuffer("sam");
		sb1.append("savi"); //method of StringBuffer class
		System.out.println(sb1);

		//toString method concept
		System.out.println("toString() method prints the class_name@hashcode");
		Demo42 obj1=new Demo42(101,"ratan");
		//here we are printing the reference variable 
		System.out.println(obj1);
		System.out.println(obj1.toString());
		//we have override the method so we got output else we get classname@hash_code
		
		Demo42 obj2= new Demo42(102,"sam");
		System.out.println("to overcome this problem we need to override the toString method");
		System.out.println(obj2);
		System.out.println(obj2.toString());

	}
}
