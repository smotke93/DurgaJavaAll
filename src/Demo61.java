//Durga Sir--- Collections  concept Part 3 video (Youtube)
// ArrayList example

import java.util.*;
public class Demo61 {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l); //in collection we get output in [....] and in MAP we get output in {.....}
		l.remove(2);
		System.out.println(l);
		l.add(2, "B");
		System.out.println(l);
		l.add("Y");
		l.add("Z");
		System.out.println(l);
	

	}

}
