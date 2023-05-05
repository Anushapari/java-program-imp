package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetpro {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<Object>();
		set.add(19);
		set.add(199);
		set.add("anu");
		set.add(10);
		set.add(49);
		set.add(19);
		set.add(20);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("anu"));
		System.out.println(set.isEmpty());
//		while(it.hasNext())
//		{
//			System.out.println
//		}
ArrayList<Object> list=new ArrayList<Object>(set);
list.add(7);
list.add("anu");
list.add(null);
System.out.println(list);
	}

}
