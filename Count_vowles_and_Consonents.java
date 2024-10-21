package com.learning.codes;

public class Count_vowles_and_Consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="Automation";
		int vowels=0;
		int consonents=0;
		for(char c :s1.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels++;
			}
			else {
				consonents++;
			}
		}
		System.out.println("vowels :"+vowels+"\nconsonents :"+consonents);

	}

}
