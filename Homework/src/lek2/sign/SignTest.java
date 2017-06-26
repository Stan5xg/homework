package lek2.sign;

import testing.SimpleUnit;

public class SignTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(Sign.sign(-10), -1));
		System.out.println(SimpleUnit.assertEquals(Sign.sign(10), 1));
		System.out.println(SimpleUnit.assertEquals(Sign.sign(0), 0));
		
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-300), 1));
		System.out.println(SimpleUnit.assertNotEquals(Sign.sign(500), -1));
		
		System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MAX_VALUE), 1));
		System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MIN_VALUE), -1));		
	}
}
