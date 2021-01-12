package com.algorithm.test;

import java.util.HashSet;
import java.util.Set;

// Input J = "aA"
// S = "aAAbbbb"
//output = 3
public class JewelsAndStones {
	
	public static void main(String[] args) {
		
		String jewerly = "aA";
		String Stone = "aAAbbbb";
		
		solve(jewerly, Stone);
	}
	public static void solve(String jew, String stone) {
		char[] jewels = jew.toCharArray();
		
		Set<Character> set = new HashSet<>();
		int result = 0;
		for ( char oneItem : jewels ) {
			set.add(oneItem);
		}
		
		for ( char oneItem : stone.toCharArray() ) {
			if ( set.contains(oneItem) ) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
