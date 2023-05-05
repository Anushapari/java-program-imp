package collectionProgram;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put(1, "anusha");
		m.put(2, "anu");
		m.put(3, "madhu");
		m.put(4, "anu");
		System.out.println(m);
		System.out.println(m.size());
		m.put(3, "x");
		System.out.println(m);
		System.out.println(m.get(2));
		m.remove(1);
		System.out.println(m);
		System.out.println(m.containsKey(2));
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("anu"));
		System.out.println(m.containsValue("r"));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		//to print all the the keys
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		//to print all the values indivisually
		for(Object j:m.values())
		{
			System.out.println(j);
		}
		//to print key and value one by one
		for(Object i:m.keySet())
		{
			System.out.println(i+"  "+m.get(i));
		}

	}

}
