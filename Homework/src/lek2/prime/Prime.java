package lek2.prime;

public class Prime {

	public static boolean isPrime(int a) {
		if (a < 2) {
			return false;
		}
		for(int n = 2; n < Math.sqrt(n) + 1; n++) {
			if ((a % n) == 0) {
				return false;
			}
		}
		return true;
	}

}
