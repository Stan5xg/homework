package lek20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lek20.Dictionary.Pair;

public class Dictionary<K,V> implements Iterable<Pair<K,V>> {

	private static final double LOAD_FACTOR = 0.75;
	private static final int MAX = 3;

	public static class Pair<K,V> {
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		K key;
		V value;
	}
	
	int size = 0;
	List<Pair<K,V>>[] data;

	@SuppressWarnings("unchecked")
	public Dictionary() {
		data = new List[MAX];
		
	}

	@SuppressWarnings("unchecked")
	public Dictionary(int size) {
		data = new List[size];
		
	}

	
	public void put(K key, V value) {
		/*
		 * 3 cases: 
		 * 1. There is no ArrayList in the cell
		 * 2. There is ArrayList, but no Pair with this key
		 * 3. There is ArrayList and Pair with this key
		 * 
		 */
		
		int index = hash(key);
		if (data[index] == null) {
			data[index] = new ArrayList<>();
			insertPair(key, value, index);
			return;
		}

		Pair<K,V> pair = getPair(index, key);

		if (pair == null) {
			insertPair(key, value, index);
			return;
		}

		pair.value = value;

	}

	private void insertPair(K key, V value, int index) {
		data[index].add(new Pair<>(key, value));
		size++;
		if (size > data.length * LOAD_FACTOR) {
			resize(data.length * 2);
		}
	}

	private int hash(K key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public V get(K key) {
		Pair<K,V> pair = getPair(key);
		return pair == null ? null : pair.value;
	}

	private Pair<K, V> getPair(K key) {
		return getPair(hash(key), key);
	}
	
	private Pair<K,V> getPair(int hash, K key) {
		int index = hash;
		List<Pair<K,V>> list = data[index];
		if (list == null) { // guard condition
			return null;
		}
		for (Pair<K,V> pair : list) {
			if (pair.key.equals(key)) {
				return pair;
			}
		}
		return null;
	}

	@Override
	public Iterator<Pair<K,V>> iterator() {
		return new Iterator<Dictionary.Pair<K,V>>() {
			int currentElement = 0;
			Iterator<Pair<K,V>> listIterator = null;

			private boolean findListIterator() {
				while (currentElement < data.length) {
					List<Pair<K,V>> currentList = data[currentElement];
					currentElement++;
					if (currentList != null) {
						listIterator = currentList.iterator();
						return true;
					}
				}
				return false;
			}
			
			@Override
			public boolean hasNext() {
				if (listIterator != null && listIterator.hasNext()) {
					return true;
				}
				
				while(findListIterator()) {
					if (listIterator.hasNext()) {
						return true;
					}
				}
				
				return false;
			}

			@Override
			public Pair<K,V> next() {
				if (!hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
		};
	}

	@SuppressWarnings("unchecked")
	public void resize(int newSize) {
		if (newSize <= 0) {
			throw new IllegalArgumentException("Can't make array size zero or negative");
		}
		
		List<Pair<K,V>>[] oldData = data;
		data = new List[newSize];
		size = 0;
		for(List<Pair<K, V>> listOfPairs : oldData) {
			if (listOfPairs == null) {
				continue;
			}
			for(Pair<K,V> pair : listOfPairs) {
				this.put(pair.key, pair.value);
			}
		}
	}

}
