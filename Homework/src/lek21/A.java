package lek21;

import java.util.Random;

class A implements Comparable<A> {
	private static final int BOUND = 1000000;
	private static final int SEED = 42;
	static Random r = new Random(SEED);
	int x = r.nextInt(BOUND);
	
	public static void resetRandom() {
		r = new Random(SEED);
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