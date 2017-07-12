package lek10;

import mytestframework.Asserts;

public class UseStringStack {
	public static void main(String[] args) {
		StringStack stack = new StringStack();
		System.out.println(Asserts.assertEquals(stack.put("one"), true));
	}
}
