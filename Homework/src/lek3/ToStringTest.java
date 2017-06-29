package lek3;

import mytestframework.Asserts;

public class ToStringTest {
	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(IntTools.toString(3, 2), "11"));
		System.out.println(Asserts.assertEquals(IntTools.toString(4, 2), "100"));
		
		System.out.println(Asserts.assertEquals(IntTools.toString(0b10101010101, 2), "10101010101"));
		System.out.println(Asserts.assertEquals(IntTools.toString(0, 2), "0"));
		
		System.out.println(Asserts.assertEquals(IntTools.toString(-1, 2), Integer.toBinaryString(-1)));
		
		System.out.println(Asserts.assertEquals(IntTools.toString(-10, 2), Integer.toBinaryString(-10)));
		System.out.println(Asserts.assertEquals(IntTools.toString(-212313, 2), Integer.toBinaryString(-212313)));
		System.out.println(Asserts.assertEquals(IntTools.toString(Integer.MIN_VALUE, 2), Integer.toBinaryString(Integer.MIN_VALUE)));
		
		
		System.out.println(Asserts.assertEquals(IntTools.toString(8, 8), Integer.toOctalString(8)));
		System.out.println(Asserts.assertEquals(IntTools.toString(-8, 8), Integer.toOctalString(-8)));
		
		System.out.println(Asserts.assertEquals(IntTools.toString(Integer.MAX_VALUE, 8), Integer.toOctalString(Integer.MAX_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toString(Integer.MIN_VALUE, 8), Integer.toOctalString(Integer.MIN_VALUE)));
		
		System.out.println(Asserts.assertEquals(IntTools.toString(15, 16), Integer.toHexString(15)));
		System.out.println(Asserts.assertEquals(IntTools.toString(Integer.MAX_VALUE, 8), Integer.toOctalString(Integer.MAX_VALUE)));
		System.out.println(Asserts.assertEquals(IntTools.toString(Integer.MIN_VALUE, 8), Integer.toOctalString(Integer.MIN_VALUE)));		
		
		

		System.out.println(Asserts.assertEquals(IntTools.toString(20, 20), "10"));
		System.out.println(Asserts.assertEquals(IntTools.toString(1000, 10), "1000"));	
		
//		System.out.println(Asserts.assertEquals(IntTools.toString(1, 1), "1000"));	
	}

}
