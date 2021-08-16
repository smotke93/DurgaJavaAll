/*video 31
we will learn how to use setters and getter method*/
class BeanClass
{
	/*BEAN class contains PRIVATE properties as mentioned below
	& PRIVATE is used to tightly bind the data.
	For every Property we have to write the setter & getter method*/
	private int eid;
	private String ename;

	/*setter are used to set values to the method/properties
	public void setXXX() {}
	here XXX is the property name i.e "Eid or any"*/
	public void setEid(int eid)
	{this.eid=eid;}
	
	public void setEname(String ename)
	{this.ename=ename;}

	/*getter method return type should be same as that of property*/
	public int getEid()
	{return eid;}
	
	public String getEname()
	{return ename;}
}
class Demo41 
{
	public static void main(String[] args) 
	{
		BeanClass obj1 = new BeanClass();
		obj1.setEid(101);
		obj1.setEname("sankalp");

		BeanClass obj2 = new BeanClass();
		obj2.setEid(102);
		obj2.setEname("pooja");
		
		BeanClass obj3 = new BeanClass();
		obj3.setEid(103);
		obj3.setEname("pranjal");

		System.out.println(obj1.getEid());
		System.out.println(obj1.getEname());

		System.out.println(obj2.getEid());
		System.out.println(obj2.getEname());

		System.out.println(obj3.getEid());
		System.out.println(obj3.getEname());
	}
}
