package lek3;

import mytestframework.Asserts;

public class ToHexStringTest {
	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(IntTools.toHexString(15), "f"));
		System.out.println(Asserts.assertEquals(IntTools.toHexString(16), "10"));
		System.out.println(Asserts.assertEquals(IntTools.toHexString(332432), Integer.toHexString(332432)));
		
		System.out.println(Asserts.assertEquals(IntTools.toHexString(Integer.MAX_VALUE), Integer.toHexString(Integer.MAX_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toHexString(Integer.MIN_VALUE), Integer.toHexString(Integer.MIN_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toHexString(0), Integer.toHexString(0)));
	}

}
