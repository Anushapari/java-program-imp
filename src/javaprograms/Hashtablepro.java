package javaprograms;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Hashtablepro {

	public static void main(String[] args) {
		Hashtable<Integer,Object> ht=new Hashtable<Integer,Object>();
		ht.put(10, 30);
		ht.put(50, "anu");
		ht.put(67, 77);
		ht.put(33, "hi");
		System.out.println(ht.size());
		System.out.println(ht.contains(50));
		System.out.println(ht.contains("anu"));
ht.remove(10);
		System.out.println(ht);
		for(Entry<Integer, Object>m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
