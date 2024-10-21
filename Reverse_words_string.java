package com.learning.codes;

import java.util.StringTokenizer;

public class Reverse_words_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =" This was java";
		String str ="";
		String original="";
		String real="";
		StringTokenizer s1 = new StringTokenizer(s);
		while(s1.hasMoreTokens()) {
			str = s1.nextToken() +" "+str;
		}
		str = str.trim();
		StringTokenizer str1 = new StringTokenizer(str);
		while(str1.hasMoreTokens()) {
			char[] ch = str1.nextToken().toCharArray();
			System.out.println(ch);
			for(char c:ch) {
				int length=ch.length;
				original=c+original;
			}
			real=original+" "+real;
		}
		
		System.out.println(real);
	}

}
