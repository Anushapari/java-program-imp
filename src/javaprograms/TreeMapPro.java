package javaprograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapPro {

	public static void main(String[] args) {
		TreeMap<Character,Object> ht=new TreeMap<Character,Object>();
		ht.put('d', 30);
		ht.put('f', "anu");
		ht.put('e', 77);
		ht.put('b', "hi");
		ht.put('q', null);
		ht.put('u',null);
		System.out.println(ht.size());
		System.out.println(ht.containsKey('d'));
		System.out.println(ht.containsValue("anu"));
ht.remove('f');
		System.out.print(ht);
	}
}