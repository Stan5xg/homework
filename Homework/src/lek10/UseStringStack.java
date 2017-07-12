package lek10;

import mytestframework.Asserts;

public class UseStringStack {
	public static void main(String[] args) {
		StringStack stack = new StringStack(3);
		
		System.out.println("========== push =========");
		System.out.println(Asserts.assertEquals(stack.push("one"), true));
		System.out.println(Asserts.assertEquals(stack.push("two"), true));
		System.out.println(Asserts.assertEquals(stack.push("three"), true));
		System.out.println(Asserts.assertEquals(stack.push("four"), false));
		
		System.out.println("========== pop =========");
		System.out.println(Asserts.assertEquals(stack.pop(), "three"));
		System.out.println(Asserts.assertEquals(stack.pop(), "two"));
		System.out.println(Asserts.assertEquals(stack.pop(), "one"));
		System.out.println(Asserts.assertEquals(stack.pop(), "null"));
		
	}
}
