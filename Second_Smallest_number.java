package com.learning.codes;

public class Second_Smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,34,6,10,88};
		int smallest = Integer.MAX_VALUE;
		int second_smallest=Integer.MAX_VALUE;
		//System.out.println(smallest);
		for(int i=0;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(smallest<arr[i] && arr[i]<second_smallest) {
				second_smallest=arr[i];
			}
		}
		System.out.println(second_smallest);

	}

}
