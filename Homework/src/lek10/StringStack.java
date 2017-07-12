package lek10;

import java.util.Arrays;

public class StringStack {

	private static final int DEFAULT_MAX_SIZE = 3;
	private String[] elements; 
	private int size = 0;
	
	public StringStack() {
		this(DEFAULT_MAX_SIZE);
	}
	
	public StringStack(int maxSize) {
		elements = new String[maxSize];
	}
	

	public boolean push(String string) {
		if (size >= elements.length) {
			return false;
		}
		elements[size++] = string;
		return true;
	}

	public String pop() {
		return size <= 0 ? null : elements[--size];
	}

	public String peek() {
		return size <= 0 ? null : elements[size-1];
	}

	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(elements,size));
	}

}
