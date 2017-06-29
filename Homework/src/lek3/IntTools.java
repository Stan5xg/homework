package lek3;

public class IntTools {

	public static String toString(int x, int base) {
		
		if (base <= 1) {
			throw new RuntimeException("Base can't be less than 2");
		}
		
		if (x == 0) {
			return "0";
		}

		String result = "";
		while (x != 0) {
			result = oneChar(Integer.remainderUnsigned(x, base)) + result;
			x = Integer.divideUnsigned(x, base);
		}
		return result;
	}

	private static String oneChar(int num) {
		if (num < 10) {
			return num+"";
		}
		
		//97 : code for 'a'
		//97 - 10 : gives 'a' if num == 10 
		char c = (char)(97 - 10 + num);
		return c+"";
	}

	public static String toBinaryString(int i) {
		return toString(i, 2);
	}

	public static String toOctalString(int i) {
		return toString(i, 8);
	}

	public static String toHexString(int i) {
		// TODO Auto-generated method stub
		return toString(i, 16);
	}
	
}
