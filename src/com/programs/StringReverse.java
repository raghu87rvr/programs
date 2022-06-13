package com.programs;

import java.util.Scanner;

public class StringReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String ori = sc.nextLine();
		String rev = reverseStringWithfun(ori);
		System.out.println(rev);

	}

	// without inbuilt function
	public static String reverseString(String orignal) {
		String s = "";
		for (int i = orignal.length() - 1; i >= 0; i--) {
			s += orignal.charAt(i);
		}
		return s;
	}
	
	public static String reverseStringWithfun(String original) {
		
		StringBuffer sb = new StringBuffer(original);
		return sb.reverse().toString();		
	}

}
