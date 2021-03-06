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
		
		stack.push("one");
		stack.push("two");
		
		System.out.println("========== peek =========");
		System.out.println(Asserts.assertEquals(stack.peek(), "two"));
		stack.push("three");	
		System.out.println(Asserts.assertEquals(stack.peek(), "three"));
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(Asserts.assertEquals(stack.peek(), "null"));
		
		
		System.out.println("========== size =========");
		System.out.println(Asserts.assertEquals(stack.size(), 0));
		stack.push("one");
		System.out.println(Asserts.assertEquals(stack.size(), 1));
		stack.push("two");
		System.out.println(Asserts.assertEquals(stack.size(), 2));
		
		System.out.println("========== toString =========");
		System.out.println(Asserts.assertEquals(stack.toString(), "[one, two]"));
		stack.pop();
		stack.pop();
		System.out.println(Asserts.assertEquals(stack.toString(), "[]"));
	}
}
