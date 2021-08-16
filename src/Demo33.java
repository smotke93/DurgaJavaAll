//video 34
//interface VS inheritance
//in java only interface can inherit more than one interfaces. But class can inherit only one class at a time
interface Itr1
{ void m1(); }//by default this methods are public and abstract
interface Itr2 extends Itr1 //see carefully
{  void m2(); } 
interface It3 
{void m3(); }

interface It4 extends Itr2,It3 //see carefully
{ void m4(); }
class Demo33 implements It4
{
	public void m1() {System.out.println("m1 method inherited");} //always remember to write public to maintain all method at same level
	public void m2() {System.out.println("m2 method inherited");}
	public void m3() {System.out.println("m3 method inherited");}
	public void m4() {System.out.println("m4 method inherited");}
	
	public static void main(String[] args) 
	{
		new Demo33().m1();
		new Demo33().m2();
		new Demo33().m3();
		new Demo33().m4();
	}
}
