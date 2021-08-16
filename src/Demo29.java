/*video 29 Polymorphism Part - 6 
It depends upon the video 38 Package & modifier part 2

Now we will create 3 modules 
1. create an package with an interface containing Method decaration only--------> Demo2900
2. create an abstract class and override only 1 method					--------> Demo30
3. create an class which will implement all remaining methods			--------> Demo29

STEPS to execute
1. compile Demo2900 file first so that directory & .class file will be generated using below command
	"javac -d . Demo2900.java" please check for confirmation
2. Now compile Demo30 using "javac -d . Demo30.java" again directory & .class will be created
3. compile Demo29 by "javac -d . Demo29.java" & then
	Lastly execute Demo29 as it contains MAIN method by "java polymorphism.concept.classfile.Demo29"
*/




 //package polymorphism.concept.classfile;
//import polymorphism.concept.implementation.*;


/*abstract class Demo30 is extended by Demo29 to implment its remaining methods*/
class Demo29 extends Demo30
{
	public void m1()
	{
		System.out.println("We have implemented M1 method in class Demo29");
	}
	public void m3()
	{
		System.out.println("We have implemented M3 method in class Demo29");
	}
	public static void main(String[] args) 
	{
	Demo29 obj=	new Demo29();
	obj.m1();
	obj.m2();
	obj.m3();
		
	}
}
 

