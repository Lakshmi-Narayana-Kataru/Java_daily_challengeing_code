package com.learning.codes;

public class Fibbonscci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =0;
		int n2 =1;
		int n3 =0;
		System.out.print(n1+" "+n2);
		while(n2<10) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2= n3;
		}

	}

}
