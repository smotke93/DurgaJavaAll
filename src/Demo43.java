class Demo43 
{
	public static void main(String[] args) 
	{
		String s1 = "sankalp";
		String s2 = "pooja";
		String s3 = "sankalp";
		
		System.out.println("Using equals() ans will be boolean type :-");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));

		System.out.println("Using equalsIgnoreCase() return type boolean :-");
		System.out.println("SANKALP".equals(s1));
		System.out.println("SANKALP".equalsIgnoreCase(s1));


		System.out.println("using compareTo() whose return type is int (same string 0)(string1 > sring2 = +ve else -ve):-");
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s2));

		System.out.println("using comparesToignoreCase() return type int :-");
		System.out.println("POOJA".compareToIgnoreCase(s2));
		System.out.println("Sankalp".compareToIgnoreCase(s3));
		
	}
}
