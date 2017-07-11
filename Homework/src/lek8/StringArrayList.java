package lek8;

import java.util.Arrays;

public class StringArrayList {
	
	static final int DEFAULT_SIZE = 2;
	
	String[] elements = new String[DEFAULT_SIZE];
	
	//  [a,b,c,d,e,f]
	//   0 1 2 3 4 5
	
	int size = 0;

	public void add(String string) {
		
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size++] = string;
//		size = size + 1;
	}

	@Override
	public String toString() {
		if (size < 1) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(elements[0]);
		for (int i = 1; i < size; i++) {
			sb.append(", " + elements[i]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	//  [a,b,c,d,e,_]
	//   0 1 2 3 4 5
	//  [a,b,d,e,_,_]
	//   0 1 2 3 4 

	public void remove(int i) {
		if (i >= size || i < 0) {
			return;
		}
		
		System.arraycopy(elements, i+1, elements, i, --size - i);
		elements[size] = null;
		
	}

	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return elements[i];
	}

	public boolean set(int i, String string) {
		if (i >= size || i < 0) {
			return false;
		}
		elements[i] = string;
		return true;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean remove(String str) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(str)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	
	
	
	

}
