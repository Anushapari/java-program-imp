package javaprograms;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListPro {

	public static void main(String[] args) {
	ArrayList<Object> list=new ArrayList<Object>();
	list.add(10);
	list.add(null);
	list.add(10);
	list.add(26.89);
	list.add("hello");
	list.add("anusha");
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.add(80);
	list1.add(29);
	list1.add(40);
	list1.add(60);
	Collections.sort(list1);
	System.out.println(list1);
	list.addAll(list1);
	System.out.println(list1);
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
list.add(3,"hi");
list.remove(1);
System.out.println(list.get(5));
System.out.println(list.remove("anusha"));
System.out.println(list.set(4,"anu"));
System.out.println(list.size());



}

}
