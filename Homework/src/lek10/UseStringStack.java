package lek10;

import mytestframework.Asserts;

public class UseStringStack {
	public static void main(String[] args) {
		StringStack stack = new StringStack(3);
		System.out.println(Asserts.assertEquals(stack.put("one"), true));
		System.out.println(Asserts.assertEquals(stack.put("two"), true));
		System.out.println(Asserts.assertEquals(stack.put("three"), true));
		System.out.println(Asserts.assertEquals(stack.put("four"), false));
		
		System.out.println(Asserts.assertEquals(stack.pop(), "three"));
		
	}
}
