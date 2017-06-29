package lek2.mod;

import mytestframework.Asserts;

public class ModTest {
	
	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(Mod.mod(2, 1), 0));		
		System.out.println(Asserts.assertEquals(Mod.mod(3, 2), 1));		

		System.out.println(Asserts.assertEquals(Mod.mod(200, 100), 0));		
		System.out.println(Asserts.assertEquals(Mod.mod(205, 10), 5));		

		System.out.println(Asserts.assertEquals(Mod.mod(-200, 100), 0));		
		System.out.println(Asserts.assertEquals(Mod.mod(-305, 10), -5));		

		System.out.println(Asserts.assertNotEquals(Mod.mod(15, 4), 4));		
		System.out.println(Asserts.assertNotEquals(Mod.mod(-15, 4), 3));		

		System.out.println(Asserts.assertEquals(Mod.mod(Integer.MAX_VALUE, Integer.MAX_VALUE), 0));		
		System.out.println(Asserts.assertEquals(Mod.mod(0, Integer.MAX_VALUE), 0));		
	}
}
