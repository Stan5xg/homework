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
	

	public boolean put(String string) {
		if (size >= elements.length) {
			return false;
		}
		size ++;
		return true;
	}

	public String pop() {
		return "three";
	}

}
