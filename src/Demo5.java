//Default VS Variables value from video 9
class Demo5 
{
	//instance variables
	int a;
	byte b;
	short c;
	long d;

	float f;
	double g;

	char h;
	boolean i;

	//static variables
	static int j;
	static 	byte k;
	
	static char l;
	static boolean m;

	//we are accessing instance variable in STATIC area so we call using object

	public static void main(String[] args) 
	{
		Demo5 obj = new Demo5();
		System.out.println("Output of INSTANCE Variables default values");
		System.out.println("int default value "+obj.a);
		System.out.println("byte default value "+obj.b);
		System.out.println("short default value "+obj.c);
		System.out.println("long default value "+obj.d);

		System.out.println("float default value "+obj.f);
		System.out.println("double default value "+obj.g);

		System.out.println("Char default value "+obj.h);
		System.out.println("Boolean default value "+obj.i);

		System.out.println("\nDefault STATIC Values");
		System.out.println("int default value "+Demo5.j);
		System.out.println("byte default value "+Demo5.k);

		System.out.println("Char default value "+Demo5.l);
		System.out.println("Boolean default value "+Demo5.m);

	}
}
