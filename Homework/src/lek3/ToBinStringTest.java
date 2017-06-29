package lek3;

import mytestframework.Asserts;

public class ToBinStringTest {
	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(IntTools.toBinaryString(3), "11"));
		System.out.println(Asserts.assertEquals(IntTools.toBinaryString(10), "1010"));
		System.out.println(Asserts.assertEquals(IntTools.toBinaryString(332432), Integer.toBinaryString(332432)));
		
		System.out.println(Asserts.assertEquals(IntTools.toBinaryString(Integer.MAX_VALUE), Integer.toBinaryString(Integer.MAX_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toBinaryString(Integer.MIN_VALUE), Integer.toBinaryString(Integer.MIN_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toBinaryString(0), Integer.toBinaryString(0)));
	}

}
