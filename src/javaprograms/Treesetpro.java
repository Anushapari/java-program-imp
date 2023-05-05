package javaprograms;


import java.util.TreeSet;

public class Treesetpro {

	public static void main(String[] args) {
		TreeSet<Object> set=new TreeSet<Object>();
		set.add(19);
		set.add(199);
	//	set.add("anu");
	//	set.add(null);
		set.add(10);
		set.add(49);
		set.add(19);
		set.add(20);
	//	set.add(null);
		
		
		System.out.println(set);
		System.out.println(set.size());
		//System.out.println(set.contains("anu"));
		System.out.println(set.isEmpty());
		System.out.println(set.descendingSet());
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.higher(49));
		System.out.println(set.lower(49));
		System.out.println(set.headSet(49));
		System.out.println(set.tailSet(49));
		System.out.println(set.subSet(10,80));
		

	}

}
