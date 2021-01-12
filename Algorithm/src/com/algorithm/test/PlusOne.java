package com.algorithm.test;

// INPUT [1,2,3]
// OUTPUT [1,2,4]
// INPUT [0,0,1]
// OUTPUT [0,0,2]
// INPUT [9,9,9]
// OUTPUT [1,0,0,0]
public class PlusOne {

	public static void main(String[] args) {
		
		int[] input = {9,9,9};
		solve(input);
	}
	
	public static void solve(int[] input) {
		
		int index = input.length-1;
		int carry = 1;
		
		while (index >= 0  && carry != 0  ) {
			input[index] = (input[index]+1) % 10;
			
			if ( input[index] == 0) {
				carry = 1;
			}
			else {
				carry = 0;
			}
			index--;
		}
		
		if ( carry == 1 ) {
			int result[] = new int[input.length+1];
			result[0] = 1;
			for ( int i = 0 ; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
		else {
			for ( int i = 0 ; i < input.length; i++) {
				System.out.println(input[i]);
			}
		}
	
	}
}
