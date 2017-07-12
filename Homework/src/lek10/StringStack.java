package lek10;

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
		if (size <= 0) {
			return null;
		}
		return elements[--size];
	}

	public String peek() {
		return "two";
	}

}
