package lek8;

import mytestframework.Asserts;

public class StringMethodsPractice {
	
	public static void main(String[] args) {
		
		String s1 = "   Hello ";
		String s2 = "Hello";  // trimmed
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";  
		String s6 = "";
		String s7 = "   ";
		String s8 = null;
		
//		System.out.println(Asserts.assertEquals(trim(s1), s2));		
//		System.out.println(Asserts.assertEquals(trim(s2), s2));
//		System.out.println(Asserts.assertEquals(trim(s3), s2));
//		System.out.println(Asserts.assertEquals(trim(s4), s2));
//		System.out.println(Asserts.assertEquals(trim(s5), s5.trim()));
//		System.out.println(Asserts.assertEquals(trim(s6), s6.trim()));
//		System.out.println(Asserts.assertEquals(trim(s7), s7.trim()));
//		System.out.println(Asserts.assertEquals(trim(s8), "null"));

		System.out.println(Asserts.assertEquals(replace("a", 'a', 'b'), "b"));
		System.out.println(Asserts.assertEquals(replace("aaaa", 'a', 'b'), "bbbb"));
		System.out.println(Asserts.assertEquals(replace("a dsfasdfa a a", 'a', 'b'), "b dsfbsdfb b b"));
		System.out.println(Asserts.assertEquals(replace("", 'a', 'b'), ""));
		System.out.println(Asserts.assertEquals(replace("ddd", 'a', 'b'), "ddd"));
		System.out.println(Asserts.assertEquals(replace(null, 'a', 'b'), "null"));
		

	}

	public static String replace(String str, char oldChar, char newChar) {
		if (str == null || str.length() == 0) {
			return str;
		}
		
		char[] chars = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (curr == oldChar) {
				chars[i] = newChar;
			} else {
				chars[i] = curr;
			}
			 
		}
		return new String(chars);
	}

	public static String trim(String str) {
		if (str == null || str.length() == 0) {
			return str;
		}

		int start = 0;
		int finish = str.length() - 1;
		
		while(str.charAt(start) == ' ' && start < finish) {
			start++;
		}
		
		while(str.charAt(finish) == ' ' &&  finish > start) {
			finish--;
		}
				
		if (start >= finish) {
			return "";
		}
		
		
		return str.substring(start, finish+1);
	}


	
	


}
