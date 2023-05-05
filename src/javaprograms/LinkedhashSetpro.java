package javaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedhashSetpro {

	public static void main(String[] args) {
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(19);
		set.add(199);
		set.add("anu");
		set.add(null);
		set.add(10);
		set.add(49);
		set.add(19);
		set.add(20);
		set.add(null);
		
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("anu"));
		System.out.println(set.isEmpty());

	}

}
