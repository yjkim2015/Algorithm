package com.algorithm.test;


//Input
// String str = "8F3Z-2e-9-w"
// String str = "8-5g-3-J";
// int k =4 
// output = 8F3Z-2E9W 8F3Z-2E9W , 8-5G3J

// 8FEZ-2e-9-wabcdef
public class LisenseKeyFormatting {

	public static void main(String[] args) {
		String input = "8FEZ-2e-9-wabcdef";
		int k = 4;
		solve(input, k);
	}
	
	public static void solve(String input, int k) {
		System.out.println(input);
		input = input.toUpperCase().replaceAll("-", "");
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		System.out.println(sb);
		for ( int i = input.length() - 4; i >= 0; i = i-4 ) {
			sb.insert(i, "-");
		}
		
		System.out.println(sb);
		
	}
	
}
