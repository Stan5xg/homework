package lek3;

import mytestframework.Asserts;

public class ToOctStringTest {
	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(IntTools.toOctalString(9), "11"));
		System.out.println(Asserts.assertEquals(IntTools.toOctalString(17), "21"));
		System.out.println(Asserts.assertEquals(IntTools.toOctalString(332432), Integer.toOctalString(332432)));
		
		System.out.println(Asserts.assertEquals(IntTools.toOctalString(Integer.MAX_VALUE), Integer.toOctalString(Integer.MAX_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toOctalString(Integer.MIN_VALUE), Integer.toOctalString(Integer.MIN_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toOctalString(0), Integer.toOctalString(0)));
	}

}
