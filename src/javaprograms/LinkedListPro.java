package javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPro {

	public static void main(String[] args) 
	{
		LinkedList<Object> list=new LinkedList<Object>();
		list.add(10);
		list.add(null);
		list.add(10);
		list.add(26.89);
		list.add("hello");
		list.add("anusha");
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(80);
		list1.add(29);
		list1.add(40);
		list1.add(60);
		//Collections.sort(list1);
	//	System.out.println(list1);
		//list.addAll(list1);
		//System.out.println(list1);
		System.out.println(list);
	if(list.contains("anusha"))
	{
		System.out.println("is present");
		
	}
	else
	{
		System.out.println("not present");
	}
	for(Object obj:list)
	{
		System.out.println(obj);
	}
	
	list.remove("anusha");
	System.out.println(list.indexOf(40));
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	//System.out.println(list.remove("anusha"));
	//System.out.println(list.set(4,"anu"));
	System.out.println(list.size());

	Iterator<Object>it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

		

	}


