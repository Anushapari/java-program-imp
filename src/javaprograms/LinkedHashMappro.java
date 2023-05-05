package javaprograms;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMappro {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Object> ht=new LinkedHashMap<Integer,Object>();
		ht.put(10, 30);
		ht.put(50, "anu");
		ht.put(67, 77);
		ht.put(33, "hi");
		System.out.println(ht.size());
		System.out.println(ht.containsKey(50));
		System.out.println(ht.containsValue("anu"));
ht.remove(10);
		System.out.println(ht);
		for(Entry<Integer, Object>m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
