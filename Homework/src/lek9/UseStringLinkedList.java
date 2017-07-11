package lek9;

import mytestframework.Asserts;

public class UseStringLinkedList {
	
	public static void main(String[] args) {
		
		StringLinkedList list = new StringLinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list);
		
		System.out.println(list.remove("two"));
		
		System.out.println(list);
		
		list = new StringLinkedList();
		
		System.out.println(list.remove("two"));
		
		list.add("One");
		System.out.println(list.remove("two"));
		System.out.println(list.remove("One"));
		
		System.out.println(list);
		list.add("one");
		list.add("two");
		list.add("three");
		
		
		System.out.println(Asserts.assertEquals(list.remove(0), "one"));
		list.add("four");
		list.add("five");
		System.out.println(Asserts.assertEquals(list.remove(3), "five"));
		
		System.out.println(Asserts.assertEquals(list.remove(30), "null"));
		
	}

}
