package com.learning.codes;

import java.util.Scanner;

public class Reverse_words_string {

	public static void main(String[] args) {
		System.out.print("Enter the String which you want to reverse :");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String[] words = s.split(" ");
		String output ="";
		StringBuilder reverse = new StringBuilder();
		for(int i =words.length-1; i>=0;i--) {
			output = new StringBuilder(words[i]).reverse().toString();
			reverse.append(output.toString()+" ");
		}
		System.out.println(reverse.toString().trim());
	}

}
