package mytestframework;

public class Asserts {

	public static boolean assertEquals(String actual, String expected) {
		boolean equals = String.valueOf(actual).equals(expected);
		if (!equals) {
			printError(actual, expected);
		}
		return equals;
	}

	public static boolean assertNotEquals(String actual, String expected) {
		boolean notEquals = !actual.equals(expected);
		if (!notEquals) {
			printErrorNot(String.valueOf(actual), String.valueOf(expected));
		}
		return notEquals;
	}

	public static boolean assertEquals(int actual, int expected) {
		boolean equals = actual == expected;
		if (!equals) {
			printError(String.valueOf(actual), String.valueOf(expected));
		}
		return equals;
	}

	public static boolean assertNotEquals(int actual, int expected) {
		boolean notEquals = actual != expected;
		if (!notEquals) {
			printErrorNot(String.valueOf(actual), String.valueOf(expected));
		}
		return notEquals;
	}

	public static boolean assertEquals(boolean actual, boolean expected) {
		boolean equals = actual == expected;
		if (!equals) {
			printError(String.valueOf(actual), String.valueOf(expected));
		}
		return equals;
	}

	public static boolean assertNotEquals(boolean actual, boolean expected) {
		boolean notEquals = actual != expected;
		if (!notEquals) {
			printErrorNot(String.valueOf(actual), String.valueOf(expected));
		}
		return notEquals;
	}

	private static void printError(String actual, String expected) {
		System.err.println("Test failed: expected '" + expected + "', but actual '" + actual + "'");
	}

	private static void printErrorNot(String actual, String expected) {
		System.err.println("Test failed: expected NOT '" + expected + "', but actual '" + actual + "'");
	}

}
