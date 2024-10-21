package com.learning.codes;

public class Palindrone {
	public static void main(String[] args) {
		String s="autua";
		String s1 = new StringBuilder(s).reverse().toString();
		if(s1.equals(s))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
