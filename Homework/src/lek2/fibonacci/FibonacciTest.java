package lek2.fibonacci;

import testing.SimpleUnit;

public class FibonacciTest {
	
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(2), true));
		System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(4), true));

		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(0), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(1), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(2), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(3), true));
		System.out.println(SimpleUnit.assertEquals(Fibonacci.isFibonacci(5), true));

		System.out.println(SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(4), true));
		
		System.out.println("Min Value: " + SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(Integer.MIN_VALUE), true));
		System.out.println("Max Value: " + SimpleUnit.assertNotEquals(Fibonacci.isFibonacci(Integer.MAX_VALUE), true));
		
	}

}
