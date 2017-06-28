package lek2.fibonacci;

public class Fibonacci {

	public static boolean isFibonacci(int a) {
		
		long one = 0;
		long two = 1;
	    long sum = one + two;
		
		while (one <= a) {
			if (one == a) {
				return true;
			} 
			one = two;
			two = sum;
			sum = one + two;
		}
		
		return false;
	}

}
