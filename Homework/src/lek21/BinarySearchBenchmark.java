package lek21;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearchBenchmark {
	private static final int ELEMENTS_NUMBER = 1000000;

	public static void main(String[] args) {

		List<A> linkedList = new LinkedList<>();

		System.out.println("== LinkedList Test ==");
		System.out.println("Full test time: " + testList(linkedList).toMillis());
		System.out.println("====================");

		List<A> arrayList = new ArrayList<>();
		A.resetRandom();
		System.out.println("== ArrayList Test ==");
		System.out.println("Full test time: " + testList(arrayList).toMillis());
		System.out.println("====================");

		Set<A> treeSet = new TreeSet<>();
		A.resetRandom();
		System.out.println("== TreeSet Test ==");
		System.out.println("Full test time: " + testSet(treeSet).toMillis());
		System.out.println("====================");

	}

	private static Duration testSet(Set<A> set) {
		Instant start = Instant.now();
		System.out.println("Filling: " + testFill(set).toMillis());
		System.out.println("Searching: " + testSearch(set, new A()).toMillis());
		Instant finish = Instant.now();
		return Duration.between(start, finish);
	}

	private static Duration testSearch(Set<A> set, A key) {
		Instant start = Instant.now();
		set.contains(key);
		Instant finish = Instant.now();
		return Duration.between(start, finish);
	}

	private static Duration testList(List<A> list) {
		Instant start = Instant.now();
		System.out.println("Filling: " + testFill(list).toMillis());
		System.out.println("Sorting: " + testSort(list).toMillis());
		System.out.println("Searching: " + testSearch(list, new A()).toMillis());
		Instant finish = Instant.now();
		return Duration.between(start, finish);
	}

	private static Duration testSearch(List<A> list, A key) {
		Instant start = Instant.now();
		Collections.binarySearch(list, key);
		Instant finish = Instant.now();
		return Duration.between(start, finish);
	}

	private static Duration testSort(List<A> list) {
		Instant start = Instant.now();
		Collections.sort(list);
		Instant finish = Instant.now();
		return Duration.between(start, finish);
	}

	private static Duration testFill(Collection<A> collection) {
		Instant start = Instant.now();
		while (collection.size() < ELEMENTS_NUMBER) {
			collection.add(new A());
		}
		Instant finish = Instant.now();
		return Duration.between(start, finish);
	}
}
