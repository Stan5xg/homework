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
		
		System.out.println(Asserts.assertEquals(trim(s1), s2));		
		System.out.println(Asserts.assertEquals(trim(s2), s2));		

	}

	public static String trim(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > ' ') {
				sb.append(str.charAt(i));
			}
		}
		
		return sb.toString();
	}


	
	


}
