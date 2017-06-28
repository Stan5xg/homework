package lek2.prime;

import testing.SimpleUnit;

public class PrimeTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(5), true));		
		System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(6), true));	
		
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(877), true));
		
		System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(-5), true));	
		System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(0), true));	
		
		
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(Integer.MAX_VALUE), true));	
		System.out.println(SimpleUnit.assertEquals(Prime.isPrime(Integer.MIN_VALUE), false));	
		
	}

}
