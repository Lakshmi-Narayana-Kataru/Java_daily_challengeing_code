package com.learning.codes;

public class Prime_Number {
	
	public static boolean isPrime(int i) {
		boolean flag=false;
		int count=0;
		if(i<2) {
			flag=false;
		}
		else {
			for(int j=1;j<=i;j++) {
				if(i%j==0 ) {
					count++;
				}
			}
			if(count==2) {
				flag=true;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) 
				System.out.println(i+" ");
		}
	}

}
