package lek21;

import java.util.Random;

class A implements Comparable<A> {
	static Random r = new Random(42);
	int x = r.nextInt(10);
	
	public static void resetRandom() {
		r = new Random(42);
	}
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(A other) {
		return x - other.x;
	}
	
	
	
}