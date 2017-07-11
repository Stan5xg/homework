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
		
		System.out.println(Asserts.assertEquals(trim(s1), s2));		
		System.out.println(Asserts.assertEquals(trim(s2), s2));
		System.out.println(Asserts.assertEquals(trim(s3), s2));
		System.out.println(Asserts.assertEquals(trim(s4), s2));
		System.out.println(Asserts.assertEquals(trim(s5), s5.trim()));
		System.out.println(Asserts.assertEquals(trim(s6), s6.trim()));

		

	}

	public static String trim(String str) {
		if (str.length() == 0) {
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
		
		return str.substring(start, finish+1);
	}


	
	


}
