package lek20;

import java.util.Random;

public class Benchmark {
	public static void main(String[] args) {
		Dictionary<Character, Integer> d1K = new Dictionary<>(1000);
		Dictionary<Character, Integer> d10K = new Dictionary<>(10_000);
		Dictionary<Character, Integer> d100K = new Dictionary<>(100_000);
		
		System.out.println("d1K :   " + testAdd(d1K));
		System.out.println("d10K :  " + testAdd(d10K));
		System.out.println("d100K : " + testAdd(d100K));
		
		Dictionary<Integer, Character> d10 = new Dictionary<>(10);
		d10.put(999, 'N');
		d10.put(888, 'E');
		d10.put(777, 'S');
		System.out.println("Adding 1K : " + testAdd(d10, 1000));
		System.out.println("Key 999: " + testGet(d10, 999));
		System.out.println("Key 888: " + testGet(d10, 888));
		System.out.println("Key 777: " + testGet(d10, 777));
		System.out.println("Key MAX: " + testGet(d10,Integer.MAX_VALUE));
		
		System.out.println("Adding 10K : " + testAdd(d10, 10_000));
		System.out.println("Key 999: " + testGet(d10, 999));
		System.out.println("Key 888: " + testGet(d10, 888));
		System.out.println("Key 777: " + testGet(d10, 777));
		System.out.println("Key MAX: " + testGet(d10,Integer.MAX_VALUE));

		System.out.println("Adding 100K : " + testAdd(d10, 100_000));
		System.out.println("Key 999: " + testGet(d10, 999));
		System.out.println("Key 888: " + testGet(d10, 888));
		System.out.println("Key 777: " + testGet(d10, 777));
		System.out.println("Key MAX: " + testGet(d10,Integer.MAX_VALUE));
		
		
	}

	private static long testGet(Dictionary<Integer, Character> d, int key) {
		long start = System.nanoTime();
		d.get(key);
		long finish = System.nanoTime();
		return finish - start;	
	}

	private static long testAdd(Dictionary<Character,Integer> d) {
		long start = System.nanoTime();
		Random r = new Random();
		while (d.size < 26) {
			char c = (char)(r.nextInt(26) + 'A');
			d.put(c, r.nextInt());
		}
		long finish = System.nanoTime();
		
		return finish - start;	
	}
	private static long testAdd(Dictionary<Integer,Character> d, int elementsCount) {
		long start = System.nanoTime();
		Random r = new Random();
		while (d.size < elementsCount) {
			char c = (char)(r.nextInt(26) + 'A');
			d.put(r.nextInt(), 'A');
		}
		long finish = System.nanoTime();
		
		return finish - start;	
	}
	
	
	

}
