package lek8;

import mytestframework.Asserts;

public class UseStringArrayList {

	public static void main(String[] args) {
		
		StringArrayList list = new StringArrayList();
		
		list.add("one");
		
		System.out.println(list);
		
		list.add("two");
		
		System.out.println(list);

		list.remove(0);
		list.remove(0);
		
		System.out.println(list);
		
		list.add("three");
		
		System.out.println(list);
		
		list.add("four");
		list.add("five");
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println(Asserts.assertEquals(list.get(0), "three"));
		System.out.println(Asserts.assertEquals(list.get(20), "null"));
	}
	
}
